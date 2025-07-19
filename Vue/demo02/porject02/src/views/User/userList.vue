<script setup lang="ts">
import { ref,reactive,onMounted,computed } from 'vue'
import{userListApi} from '@/api/user'

//角色列表
const userList = reactive([])
// 总条数数据存储
const total = ref(0);
//当前页
const currentPage = ref(1);
const pageSize = ref(5);
const size = "default";
const disabled = false;
const background = true;
//条件查询对象
const formInline = reactive({
    name:'',
    element:'',
    weapon:'',
    page: computed(() => currentPage.value),  // 建立响应式关联reactive 本身不会自动追踪 ref 的变化，需要用 computed 建立桥梁
     pageSize: computed(() => pageSize.value)
})
//获取列表数据
const getUserList = async()=>{
    const res = await userListApi(formInline) as any
    userList.length=0
    userList.push(...res.data.rows)
    total.value = res.data.total

}
//每页条数改变时
const handleSizeChange = async(val:number)=>{
    pageSize.value = val
     currentPage.value = 1
    getUserList()
}
//当前页改变时
const handleCurrentChange = async(val:number)=>{
     currentPage.value = val
    getUserList()
}
//清空搜索条件
const clear = () => {
  formInline.name = ''       // 修正为实际存在的字段
  formInline.element = ''   // 元素属性
  formInline.weapon = ''    // 武器类型
  currentPage.value = 1     // 重置页码
  getUserList()             // 重新获取数据
}

//预加载
onMounted(async()=>{
    getUserList()
    
})

</script>

<template>
<div>
    <el-form :inline="true" :model="formInline" class="demo-form-inline">
    <el-form-item label="名称">
      <el-input v-model="formInline.name" placeholder="请输入角色名称" clearable />
    </el-form-item>
    <el-form-item label="元素属性"  >
      <el-select
        v-model="formInline.element"
        placeholder="请选择元素属性"
        clearable
      >
        <el-option label="水" value="1" />
        <el-option label="火" value="2" />
        <el-option label="冰" value="3" />
        <el-option label="雷" value="4" />
        <el-option label="风" value="5" />
        <el-option label="岩" value="6" />
        <el-option label="草" value="7" />
      </el-select>
    </el-form-item>
    <el-form-item label="武器类型">
      <el-select
        v-model="formInline.weapon"
        placeholder="请选择武器类型"
        clearable
      >
        <el-option label="单手剑🗡" value="1" />
        <el-option label="双手剑🗡" value="2" />
        <el-option label="长柄武器" value="3" />
        <el-option label="法器" value="4" />
        <el-option label="弓箭🏹" value="5" />
      </el-select>
    </el-form-item>
  
    <el-form-item>
       <el-button type="success" round @click="getUserList">搜索</el-button>
      <el-button type="danger" round @click="clear">清空</el-button>
    </el-form-item>
  </el-form>
<div>
    <h1>角色列表</h1>
    <el-table :data="userList" style="width: 100%">
    <el-table-column fixed prop="userId" label="ID" width="150" />
    <el-table-column prop="name" label="Name" width="120" />
    <el-table-column prop="element" label="元素属性" width="120" >
      <template #default="scope">
        {{ scope.row.element == 1 ? "水" : scope.row.element == 2 ? "火" : scope.row.element == 3 ? "冰" :
         scope.row.element == 4 ? "雷" : scope.row.element == 5 ? "风" : scope.row.element == 6 ? "岩" : "草" }}
      </template>
    </el-table-column>
     <el-table-column prop="weapon" label="武器类型" width="120" >
      <template #default="scope">
        {{ scope.row.weapon == 1 ? "单手剑🗡" : scope.row.weapon == 2 ? "双手剑🗡" : scope.row.weapon == 3 ? "长柄武器" :
         scope.row.weapon == 4 ? "法器" : "弓箭🏹" }}
      </template>
    </el-table-column>
    
    <el-table-column  label="头像" width="120">
        <template #default="scope">
            <img :src="scope.row.image" style="width: 100px; height: 100px;" />
        </template>
    </el-table-column>
    <el-table-column fixed="right" label="Operations" min-width="120">
      <template #default ="scope">
        <el-button link type="primary" size="small" @click="handleView(scope.row.userId)"> 查看</el-button>
      </template>
    </el-table-column>
  </el-table>
</div>
  <br>
  <div class="demo-pagination-block">
    <el-pagination
      v-model:current-page="currentPage"
      v-model:page-size="pageSize"
      :page-sizes="[5, 10]"
      :size="size"
      :disabled="disabled"
      :background="background"
      layout="total, sizes, prev, pager, next, jumper"
      :total="total"
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
    />
  </div>

  </div>
</template>

<style scoped>

</style>
