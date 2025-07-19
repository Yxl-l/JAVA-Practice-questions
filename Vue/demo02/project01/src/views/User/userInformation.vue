<script setup lang="ts">
import { onMounted, reactive, ref } from "vue";
import { userIdApi } from "@/api/user";
// import Login from '../Login/login.vue'
import { useRoute } from "vue-router";
// 路由实例对象useRoute 用于 获取 路由信息（读操作）useRouter 用于 控制 路由行为（写操作）
let route = useRoute();
// 获取路由参数中的userId
const userId = ref(0); //改为number类型
//回显用户信息对象
const user = ref({
  userId: 0, //改为number类型
  name: "",
  username: "",
  password: "",
  element: "",
  weapon: "",
  age: 0, // 改为number类型
  image: "",
});
onMounted(async () => {
  userId.value = Number(route.params.userId); //// 使用route.params, 转换为数字
  let res = await userIdApi(userId.value);
  user.value = res.data;
});
</script>

<template>
  <div>
    <h1>角色信息</h1>
    <div>
      <el-form :model="user" label-width="auto" style="max-width: 600px">
        <el-row :gutter="10">
          <el-col :span="12">
            <el-form-item label="用户id号" prop="userId">
              <el-input v-model="user.userId" />
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="姓名" prop="name">
              <el-input v-model="user.name" />
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="用户名" prop="username">
              <el-input v-model="user.username" />
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="密码" prop="password">
              <el-input v-model="user.password" />
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="年龄" prop="age">
              <el-input v-model="user.age" />
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="元素属性">
              <el-select v-model="user.element" placeholder="请选择元素属性">
                <el-option label="水" value="1" />
                <el-option label="火" value="2" />
                <el-option label="冰" value="3" />
                <el-option label="雷" value="4" />
                <el-option label="风" value="5" />
                <el-option label="岩" value="6" />
                <el-option label="草" value="7" />
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="武器类型">
              <el-select v-model="user.element" placeholder="请选择武器类型">
                <el-option label="单手剑🗡" value="1" />
                <el-option label="双手剑🗡" value="2" />
                <el-option label="长柄武器" value="3" />
                <el-option label="法器" value="4" />
                <el-option label="弓箭🏹" value="5" />
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="图像">
              <img v-if="user.image" :src="user.image" />
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
    </div>
  </div>
</template>

<style scoped>
.user-info-container {
  width: 100%;
  padding: 20px;
  box-sizing: border-box;
}

.title {
  color: #303133;
  margin-bottom: 24px;
  padding-bottom: 12px;
  border-bottom: 1px solid #ebeef5;
}

.form-wrapper {
  background-color: white;
  padding: 20px;
  border-radius: 4px;
  box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);
}

.user-form {
  padding: 10px;
}

.avatar-container {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 200px;
  border: 1px dashed #dcdfe6;
  border-radius: 4px;
  overflow: hidden;
  background-color: #f5f7fa;
}

.avatar-image {
  max-width: 100%;
  max-height: 100%;
  object-fit: contain;
}

.avatar-placeholder {
  color: #909399;
  font-size: 14px;
}

/* 响应式调整 */
@media (max-width: 768px) {
  .user-info-container {
    width: 100%;
    position: relative;
    height: auto;
  }
}
</style>
