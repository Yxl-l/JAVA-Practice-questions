import { createRouter, createWebHistory } from 'vue-router'
import DeptList from '@/views/dept/index.vue'
import DeptHandler from '@/views/dept/handler.vue'
import EmpList from '@/views/emp/index.vue'
import EmpHandler from '@/views/emp/handler.vue'


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
 routes: [
    {path: '/deptList',name: 'dept',component: DeptList},
    {path: '/deptHandler',name: 'deptHandler',component: DeptHandler},
    {path: '/empList',name: 'emp',component: EmpList},
    {path: '/empHandler',name: 'empHandler',component: EmpHandler},
  ]
})

export default router
