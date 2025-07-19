<template>
  <div class="user">
 
    <div class="userList">
      <router-view></router-view>
    </div>
  </div>
</template>

<style scoped>
.user { 
  display: flex;
}
.userList {
  margin-left: 300px;
}
</style>