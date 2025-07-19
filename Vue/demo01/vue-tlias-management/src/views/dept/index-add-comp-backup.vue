<script setup>
// 导入ref
import {onMounted, ref} from 'vue'
// 导入depts模块
import {queryAllApi,addApi} from '@/api/depts'
// 弹框导入
import { ElMessage } from 'element-plus'

// 表格数据
const tableData = ref([])
// 远程查询数据，使用axios查询
const queryAll=async()=>{
  // 调用方法  response.data
  const result = await queryAllApi()
  tableData.value=result.data
}

// 预加载操作
onMounted(()=>{
  queryAll()
})

// 定义弹框标题
const dialogTitle = ref('新增部门')
// 是否显示弹框
const dialogVisible = ref(false)
// 输入表单的宽度
const formLabelWidth = '140px'
// 定义部门信息，存储部门名字
const deptForm=ref({name:''})

// 实现保存->api/depts.js实现保存
const add=()=>{
  // 设置弹框值-=true
  dialogVisible.value=true
}

// 定义表单关联对象,关联到表单的ref对应dom元素
const ruleFormRef=ref(null)
const save=async ()=>{
  // 验证ruleFormRef绑定的Dom元素是否存在
  if (!ruleFormRef) return

  // 进行表单校验
  await ruleFormRef.value.validate((valid, fields) => {
    if (valid) {
      //执行提交
      addApi(deptForm.value).then((res)=>{
        if(res.code==1){
          // dialogVisible设置为false
          dialogVisible.value=false
          // 清空原表单数据
          deptForm.value={name:''}
          //添加成功，查询最新数据
          queryAll()
          // 弹框
          ElMessage({
            message: '新增部门成功！',
            type: 'success',
          })
        }else{
          //添加失败，提示失败
          ElMessage.error('新增部门失败！')
        }
      })
    } else {
      console.log('error submit!', fields)
    }
  })

}

// 定义表单校验规则
const rules = {
  name: [
    { required: true, message: '请输入部门名称', trigger: 'blur' },
    { min: 2, max: 50, message: '长度在 2 到 50 个字符', trigger: 'blur' }
  ]
}
</script>

<template>
<!-- 
  弹框功能
  表单：部门名字
-->
   <el-dialog
    v-model="dialogVisible"
    :title="dialogTitle"
    width="500"
  >
    <el-form
    ref="ruleFormRef"
    :rules="rules"
    :model="deptForm">
      <el-form-item label="部门名称" :label-width="formLabelWidth" prop="name">
        <el-input v-model="deptForm.name" autocomplete="off" />
      </el-form-item>
    </el-form>

    <template #footer>
      <div class="dialog-footer">
        <el-button @click="dialogVisible = false">关闭</el-button>
        <el-button type="primary" @click="save()">
          提交
        </el-button>
      </div>
    </template>
  </el-dialog>


  部门管理
    <br/>
  <br/>
  <p>
    <el-button type="primary" @click="add()">新增部门</el-button>
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
