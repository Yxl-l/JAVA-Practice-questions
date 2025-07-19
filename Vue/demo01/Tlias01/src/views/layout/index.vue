<template>
  <div class="common-layout">
    <el-container>
      <el-header>Header</el-header>
      <el-container>
        <el-aside width="200px">
          <el-menu
            default-active="2"
            class="el-menu-vertical-demo"
            router
          >
            <el-sub-menu index="1">
              <template #title>部门管理</template>
              <el-menu-item index="/deptList">部门列表</el-menu-item>
              <el-menu-item index="/deptHandler">部门维护</el-menu-item>
            </el-sub-menu>
            <el-sub-menu index="2">
              <template #title>员工管理</template>
              <el-menu-item index="/empList">员工列表</el-menu-item>
              <el-menu-item index="/empHandler">员工维护</el-menu-item>
            </el-sub-menu>
          </el-menu>

        </el-aside>
        <el-main>
          <router-view></router-view>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<style scoped>
  /* 顶部颜色 */
  .el-header{
    background-color:palegreen;
  }
  /* 菜单颜色 */
  .el-aside{
    background-color: azure;
    min-height: 900px;
  }
</style>