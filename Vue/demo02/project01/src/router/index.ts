import { createRouter, createWebHistory } from 'vue-router'
// import HomeView from '../views/HomeView.vue'
import Login from '@/views/Login/login.vue'
import User from '@/views/User/index.vue'
import UserInformation from '@/views/User/userInformation.vue'
import UserList from '@/views/User/userList.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/', component: Login },
    { path: '/login', component: Login },
    {
      path: '/user', component: User,
      children: [
        { path: '', redirect: '/user/userList' },
        {   path: 'userList', name: 'userList' , component: UserList },
        { path: 'userInformation/:userId', name: 'userInformation', component: UserInformation }

      ]
    },
    // {
    //   path: '/about',
    //   name: 'about',
    //   // route level code-splitting
    //   // this generates a separate chunk (About.[hash].js) for this route
    //   // which is lazy-loaded when the route is visited.
    //   component: () => import('../views/AboutView.vue'),
    // },
  ],
})

export default router
