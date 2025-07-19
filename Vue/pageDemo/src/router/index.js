import { createRouter, createWebHistory } from 'vue-router'
import Layout from "@/views/layout.vue"
import User from "@/views/user.vue"
import Good from "@/views/good.vue"
import Login from "@/views/login.vue"
import Index from "@/views/index.vue"

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {path: '/',component: Layout,children: [
      {path: '/',component: Index},
      {path: '/good',component: Good},
      {path: '/user',component: User}
    ]},
    {path: '/login',component: Login}
  ],
})

export default router
