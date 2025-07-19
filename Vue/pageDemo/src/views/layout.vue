<script setup>

</script>

<template>
    <el-container>
      <el-header>头部导航</el-header>
      <el-container>
        <el-aside width="200px">
            <el-menu
                default-active="2"
                class="el-menu-vertical-demo"
                router
            >
            <el-menu-item index="/">
            <span>首页</span>
            </el-menu-item>
          <el-sub-menu index="1">
            <template #title>用户</template>
            <el-menu-item index="/user">用户列表</el-menu-item>
          </el-sub-menu>
          <el-sub-menu index="2">
            <template #title>菜单</template>
            <el-menu-item index="/good">菜单列表</el-menu-item>
          </el-sub-menu>
      </el-menu>
        </el-aside>
        <el-main>
            <router-view />
        </el-main>
      </el-container>
    </el-container>
</template>

<style scoped>
    .el-aside {
    background-color: skyblue;
    min-height: 800px;
    }
    .el-header {
    background-color: pink;
    }
</style>
