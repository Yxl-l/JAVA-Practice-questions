<script setup>
import { getPageApi } from '@/api/user';
import { onMounted, ref } from 'vue';

const userList = ref([])
const page = ref(1)
const pageSize = ref(10)
const totalSize = ref(0)
const searchForm = ref({
    name: '',
    gender: '',
    faction: ''
})


const reset = ()=>{
    page.value = 1
    pageSize.value = 10
    searchForm.value = {
        name: '',
        gender: '',
        faction: ''
    }
    getPage()
}
const getPage = async ()=>{
    const result = await getPageApi(page.value,pageSize.value,searchForm.value.name,searchForm.value.gender,searchForm.value.faction)
    userList.value = result.rows
    totalSize.value = result.total
}

const handleSizeChange = (val) => {
  pageSize.value = val
  page.value = 1
  getPage()
}
const handleCurrentChange = (val) => {
  page.value = val
  getPage()
}

onMounted(()=>{
  getPage() 
})
</script>

<template>
    <el-form :inline="true" :model="searchForm" >
    <el-form-item label="姓名">
      <el-input v-model="searchForm.name" placeholder="请输入" clearable />
    </el-form-item>
    <el-form-item label="性别">
      <el-select
        v-model="searchForm.gender"
        placeholder="请选择"
        style="width: 200px;"
        clearable
      >
        <el-option label="男" value="1" />
        <el-option label="女" value="2" />
      </el-select>
    </el-form-item>
    <el-form-item label="所属阵营">
      <el-select
        v-model="searchForm.faction"
        placeholder="请选择"
        style="width: 200px;"
        clearable
      >
        <el-option label="魏" value="魏" />
        <el-option label="蜀" value="蜀" />
        <el-option label="吴" value="吴" />
      </el-select>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="getPage">查询</el-button>
      <el-button @click="reset">重置</el-button>
    </el-form-item>
  </el-form>

  <el-table :data="userList" style="width: 100%">
    <el-table-column type="index" label="序号" width="400%"  />
    <el-table-column prop="name" label="姓名" />
    <el-table-column prop="gender" label="性别" >
        <template #default="scope">
          <el-tag v-if="scope.row.gender===1">男</el-tag>
          <el-tag v-else>女</el-tag>
        </template>
    </el-table-column>
    <el-table-column prop="faction" label="所属阵营" />
  </el-table>

  <el-pagination
      v-model:current-page="currentPage"
      v-model:page-size="pageSize"
      :page-sizes="[10, 20, 30, 40]"
      :small="small"
      :disabled="disabled"
      :background="background"
      layout="total, sizes, prev, pager, next, jumper"
      :total="totalSize"
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
    />
</template>