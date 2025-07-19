<script setup lang="ts">
import { reactive } from 'vue'
import { useUserStore } from '@/store/loginStore'
import { useRouter } from "vue-router";
// 路由实例对象
let router = useRouter();

const loginForm = reactive({
  username: '',
  password: ''
})

 const onSubmitPinia= async() => {
        let result = await useUserStore().userLogin(loginForm.username,loginForm.password) 
        console.log(result)
        if(result.code){
          router.push('/user')//编程式导航跳转
        }
    }
 const onReset=()=>{ 
  loginForm.username = ''
  loginForm.password = ''
}   

</script>

<template>
  <div id="container">
    <div class="login-form">
      <el-form label-width="80px">
        <p class="title">原神</p>
        <el-form-item label="用户名" prop="username">
          <el-input v-model="loginForm.username" placeholder="请输入用户名"></el-input>
        </el-form-item>

        <el-form-item label="密码" prop="password">
          <el-input
            type="password"
            v-model="loginForm.password"
            placeholder="请输入密码"
          ></el-input>
        </el-form-item>

        <el-form-item>
          <el-button class="button" type="primary" @click="onSubmitPinia">登 录</el-button>
          <el-button class="button" type="info" @click="onReset">重 置</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<style scoped>
/* 新增全局样式穿透 */
:global(html), :global(body), :global(#app) {
  height: 100%;
  margin: 0;
}

#container {
  height: 100vh;
  width: 100vw;
  display: flex;
  justify-content: center;
  align-items: center;
  background-image: url("https://pic.rmb.bdstatic.com/bjh/a63879bf91d0873950fe64d37e8e1bb841.png@h_1280");
  background-size: cover;
  background-position: center;
}

.login-form {
   
  max-width: 400px;
  padding: 30px;
  margin: 0 auto;
  border: 1px solid #e0e0e0;
  border-radius: 10px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
  background-color: white;
}

.title {
  font-size: 30px;
  font-family: "楷体";
  text-align: center;
  margin-bottom: 30px;
  font-weight: bold;
}

.button {
  margin-top: 30px;
  width: 120px;
}

</style>

