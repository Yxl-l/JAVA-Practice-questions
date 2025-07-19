<script setup>
import { loginApi } from '@/api/user';
import router from '@/router';
import { ElMessage } from 'element-plus';
import { ref } from 'vue';


const loginForm = ref({ username: '', password: '' })

const onSubmit = async()=>{
    const result = await loginApi(loginForm.value)
    if(result.code == 1){
        ElMessage.success('登录成功')
        localStorage.setItem("userInfo",JSON.stringify(result.data))
        router.push('/')
    }else{
        ElMessage.error(result.msg)
    }
}
</script>

<template>
    <el-form :inline="true" :model="loginForm" >
    <el-form-item label="用户名">
      <el-input v-model="loginForm.username" placeholder="请输入" clearable />
    </el-form-item>
    <el-form-item label="密码">
      <el-input type="password" v-model="loginForm.password" placeholder="请输入" clearable />
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="onSubmit">登录</el-button>
    </el-form-item>
  </el-form>
</template>

<style scoped>

</style>