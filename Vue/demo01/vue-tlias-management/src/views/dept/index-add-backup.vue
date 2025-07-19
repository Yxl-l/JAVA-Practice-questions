<script setup>
// 导入ref
import {onMounted, ref} from 'vue'
// 导入depts模块
import {queryAllApi} from '@/api/depts'

// 表格数据
const tableData = ref([])
// 远程查询数据，使用axios查询
const queryAll=async()=>{
  const result = await queryAllApi()
  tableData.value=result.data
}

// 预加载操作
onMounted(()=>{
  queryAll()
})
</script>

<template>
  部门管理
    <br/>
  <br/>
  <p>
    <el-button type="primary">新增部门</el-button>
  </p>
  <br/>
  <br/>
    <el-table :data="tableData" style="width: 100%">
    <el-table-column prop="id" label="ID" width="180" />
    <el-table-column prop="name" label="部门名称" />
    <el-table-column prop="updateTime" label="最后修改时间" width="180" />
    <el-table-column label="操作">
      <template #default="scope">
        <el-button type="primary" size="small">编辑</el-button>
        <el-button type="danger" size="small">删除</el-button>
      </template>
    </el-table-column>
  </el-table>
</template>

<style scoped>

</style>
