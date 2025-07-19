<script setup lang="ts">
import { onMounted, reactive,ref } from 'vue'
import { computed } from 'vue'
import {userListApi} from '@/api/user'
// import Login from '../Login/login.vue'
import { useRouter } from "vue-router"//useRoute 用于 获取 路由信息（读操作）useRouter 用于 控制 路由行为（写操作）
// 路由实例对象
let router = useRouter();

//list列表数据
const userList = reactive([] as any[]) 
//清空搜索条件
const clear = () => {
  formInline.name = ''       // 修正为实际存在的字段
  formInline.element = ''   // 元素属性
  formInline.weapon = ''    // 武器类型
  currentPage.value = 1     // 重置页码
  getUserList()             // 重新获取数据
}
//获取列表数据
const getUserList = async()=>{
  console.log(formInline)
    const res = await userListApi(formInline) as any
    console.log(res)
     userList.length = 0 // 完全清空数组
     userList.push(...res.data.rows) // 添加新数据扩展运算符 ...作用：将数组"展开"为单独的元素
    //  Object.assign(userList, res.data.rows)  
//      // 推荐方式清空 userList 数组的所有现有内容
// 将 res.data.rows 数组中的所有元素复制到 userList 中
// 保持 userList 的响应式特性不变
    total.value = res.data.total
  
}

// 总条数数据存储
const total = ref(0);
//当前页
const currentPage = ref(1);
const pageSize = ref(5);
const size = "default";
const disabled = false;
const background = true;
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
//查询条件对象
const formInline = reactive({
    name: "",
    element: "",
    weapon: "",
    page: computed(() => currentPage.value),  // 建立响应式关联reactive 本身不会自动追踪 ref 的变化，需要用 computed 建立桥梁
  pageSize: computed(() => pageSize.value)
});





//预加载
onMounted(async()=>{
    getUserList()
    
})
//点击查看
const handleView = async(userId:number)=>{
   router.push(`/user/userInformation/${userId}`)
}


</script>

<template>
  <div class="box">
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

  <div class="user-list">
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

  </div>
</template>

<style scoped>
.box {
  padding: 20px;
  background-color: #f5f7fa;
  min-height: 100vh;
  width: 850px;
}
.demo-form-inline {
  padding: 20px;
  background: #fff;
  border-radius: 8px;
  box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);
  margin-bottom: 20px;
}
.el-form-item {
  margin-right: 20px;
  margin-bottom: 0;
}
.el-input {
  width: 200px;
}
.el-select{
  width: 100px;
}

.el-input__inner, .el-select__wrapper {
  border-radius: 20px;
}
.el-button {
  margin-left: 10px;
  transition: all 0.3s;
}

.el-button--success {
  background-color: #67c23a;
  border-color: #67c23a;
}

.el-button--danger {
  background-color: #f56c6c;
  border-color: #f56c6c;
}
@media (max-width: 768px) {
  .demo-form-inline {
    padding: 15px;
  }
  
  .el-form-item {
    margin-right: 10px;
    margin-bottom: 10px;
  }
  
  .el-input, .el-select {
    width: 140px;
  }
}
.el-button:hover {
  opacity: 0.8;
  transform: translateY(-2px);
}

.el-input__inner:focus, 
.el-select__wrapper:focus-within {
  border-color: #409eff;
  box-shadow: 0 0 0 2px rgba(64, 158, 255, 0.2);
}
.user-list {
  background: #fff;
  border-radius: 8px;
  box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);
  padding: 20px;
}
h1 {
  text-align: center;
  color: #303133;
  margin-bottom: 20px;
  font-size: 24px;
  padding-bottom: 15px;
  border-bottom: 1px solid #ebeef5;
}
.el-table {
  margin-bottom: 20px;
  border-radius: 4px;
  overflow: hidden;
}

.el-table :deep(.el-table__header-wrapper) th {
  background-color: #f8f8f9;
  color: #515a6e;
  font-weight: bold;
}

.el-table :deep(.el-table__body-wrapper) tr:hover {
  background-color: #f5f7fa;
}
img {
  max-width: 100px;
  max-height: 100px;
  border-radius: 4px;
  object-fit: cover;
  border: 1px solid #ebeef5;
}
.demo-pagination-block {
  display: flex;
  justify-content: center;
  margin-top: 20px;
}

.el-pagination {
  padding: 10px 0;
}

.el-pagination.is-background .btn-next,
.el-pagination.is-background .btn-prev,
.el-pagination.is-background .el-pager li {
  border-radius: 4px;
  margin: 0 5px;
}
.el-button--primary {
  color: #409EFF;
}

.el-button--primary:hover {
  color: #66b1ff;
}
@media (max-width: 768px) {
  .box {
    padding: 10px;
  }
  
  .user-list {
    padding: 15px;
  }
  
  .el-table {
    font-size: 14px;
  }
  
  img {
    width: 60px;
    height: 60px;
  }
}
</style>