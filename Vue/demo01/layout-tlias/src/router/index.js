import { createRouter, createWebHistory } from 'vue-router'
import DeptList from '@/views/dept/index.vue'
import DeptHandler from '@/views/dept/handler.vue'
import EmpList from '@/views/emp/index.vue'
import EmpHandler from '@/views/emp/handler.vue'
import Login from '@/views/login/index.vue';
import Index from '@/views/index/index.vue';
import Layout from '@/views/layout/index.vue';
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/', component: Layout,
      children: [
        { path: '/', redirect:'/index' },
        { path: '/index', component: Index },
        { path: '/deptList',  component: DeptList },
        { path: '/deptHandler', component: DeptHandler },
        { path: '/empList', component: EmpList },
        { path: '/empHandler', component: EmpHandler },
       ]
    },
     { path: '/login', component: Login },


  ]
})

export default router
