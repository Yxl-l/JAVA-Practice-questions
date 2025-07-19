<script setup>
// 引入组件
import {onMounted, ref} from 'vue'
// 导入组件方法
import {queryAll,addApi,queryByIdApi,updateApi,deleteApi} from '@/api/dept'
// 提示框导入
import { ElMessage } from 'element-plus'

// 创建一个变量用于存储所有集合
const dataList=ref([])
// 远程查询定义
const queryList=async ()=>{
  // 远程查询
  let result =await queryAll()
  // 数据赋值
  dataList.value=result.data
}

// 初始化调用
onMounted(()=>{
  queryList()
})

// 弹框定义
const tips=ref('新增部门')
// 弹框是否显示，默认不显示
const dialogShow = ref(false)

// 显示弹框
const showDialog=()=>{
  // 显示弹框
  dialogShow.value=true
  tips.value='新增部门'
}

// 新增或修改的数据对象
const ruleForm=ref({name:''})

// 校验规则
const rules = ref({
  name: [
    { required: true, message: '部门名称不能为空', trigger: 'blur' },
    { min: 3, max: 50, message: '部门名称长度3-50', trigger: 'blur' },
]})

// 保存方法
// 1.1 关联表单对象
const ruleFormRef = ref(null)
// 1.2 保存操作
const save=async()=>{
  // 1.3 校验表单参数
  if (!ruleFormRef) return

  // 1.3 表单数据校验
  await ruleFormRef.value.validate(async(valid, fields) => {
    if (valid) {
      let result = null
      if(ruleForm.value.id){
        //修改操作
        result = await updateApi(ruleForm.value)
      }else{
        // 调用添加方法
        result = await addApi(ruleForm.value)
      }

      if(result.code){
        queryList()

        ElMessage({
          message: '操作成功！',
          type: 'success',
          plain: true,
        })

        // 查询所有，关闭对话框，清空原数据
        dialogShow.value=false
        ruleForm.value={name:''}
      }else{
        ElMessage({
          message: '操作失败！',
          type: 'error',
          plain: true,
        })
      }
    } else {
      console.log('error submit!', fields)
    }
  })
}

// 根据ID查询部门信息
const queryById=async(row)=>{
  let result = await queryByIdApi(row.id)
  // 赋值给表单对象
  ruleForm.value.id=result.data.id
  ruleForm.value.name=result.data.name
  // 显示编辑框
  dialogShow.value=true
  tips.value='修改部门'
}

// 删除方法
const deleteById=async (row)=>{
  let reuslt = await deleteApi(row.id)
  if(reuslt.code){
      ElMessage({
          message: '操作成功！',
          type: 'success',
          plain: true,
        })

        queryList()
  }else{
    ElMessage({
          message: '操作失败！',
          type: 'error',
          plain: true,
        })
  }
}
</script>
<template>
  <h3>部门管理</h3>
  <el-button type="primary" @click="showDialog">新增</el-button>

  <!-- 编辑或者修改的弹框 -->
  <el-dialog
      v-model="dialogShow"
      :title="tips"
      width="500"
      :before-close="handleClose"
    >
      <el-form
        ref="ruleFormRef"
        style="max-width: 600px"
        :model="ruleForm"
        :rules="rules"
        label-width="auto"
      >
        <el-form-item label="部门名称" prop="name">
          <el-input v-model="ruleForm.name" />
        </el-form-item>
        </el-form>
      <template #footer>
        <div class="dialog-footer">
          <el-button @click="dialogShow = false">关闭</el-button>
          <el-button type="primary" @click="save()">
            提交
          </el-button>
        </div>
      </template>
    </el-dialog>


  <p>
    <el-table :data="dataList" style="width: 100%">
      <el-table-column prop="id" label="ID" width="180" />
      <el-table-column prop="name" label="部门名字" width="180" />
      <el-table-column prop="updateTime" label="最后修改时间" />
      <el-table-column label="操作">
        <template #default="scope">
          <el-button type="primary" size="mini" @click="queryById(scope.row)">编辑</el-button>
          <el-button type="danger" size="mini" @click="deleteById(scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </p>
</template>
<style scoped></style>