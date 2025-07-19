//  <script setup>
// import { ref } from "vue";
// import { ElMessage } from "element-plus";

// // 导入路由
// import router from "@/router/index";

// // 导入loginApi方法
// import { loginApi } from "@/api/login";

// // 定义表单数据
// let loginForm = ref({ username: "", password: "" });

// // 定义发送请求函数，执行登录操作
// const login = async () => {
//   //执行登录
//   let result = await loginApi(loginForm.value);
//   // 登录成功
//   if (result.code) {
//     // 提示登录成功
//     ElMessage.success("登录成功！");
//     //     用户身份信息存入到localStorage
//     localStorage.setItem("loginUser", JSON.stringify(result.data));
//     //     跳转到首页
//     router.push("/index");
//   } else {
//     // 登录失败，提示错误
//     ElMessage.error("登录失败，请重试！");
//   }
// };
// </script>

// <template>
//   <div id="container">
//     <div class="login-form">
//       <el-form label-width="80px">
//         <p class="title">Tlias智能学习辅助系统</p>
//         <el-form-item label="用户名" prop="username">
//           <el-input v-model="loginForm.username" placeholder="请输入用户名"></el-input>
//         </el-form-item>

//         <el-form-item label="密码" prop="password">
//           <el-input
//             type="password"
//             v-model="loginForm.password"
//             placeholder="请输入密码"
//           ></el-input>
//         </el-form-item>

//         <el-form-item>
//           <el-button class="button" type="primary" @click="login">登 录</el-button>
//           <el-button class="button" type="info" @click="">重 置</el-button>
//         </el-form-item>
//       </el-form>
//     </div>
//   </div>
// </template>

// <style scoped>
// #container {
//   padding: 10%;
//   height: 410px;
//   background-image: url("/public/腿子.png");
//   background-repeat: no-repeat;
//   background-size: cover;
// }

// .login-form {
//   max-width: 400px;
//   padding: 30px;
//   margin: 0 auto;
//   border: 1px solid #e0e0e0;
//   border-radius: 10px;
//   box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
//   background-color: white;
// }

// .title {
//   font-size: 30px;
//   font-family: "楷体";
//   text-align: center;
//   margin-bottom: 30px;
//   font-weight: bold;
// }

// .button {
//   margin-top: 30px;
//   width: 120px;
// }
// </style>
