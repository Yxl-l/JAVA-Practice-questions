// import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'
import ElementPlus from 'element-plus'

import 'element-plus/dist/index.css'
import App from './App.vue'
import router from './router'
//引入pinia-plugin-persistedstate
import piniaPluginPersistedstate from 'pinia-plugin-persistedstate'
// 创建实例
const app = createApp(App)
//pinia
const pinia = createPinia()
pinia.use(piniaPluginPersistedstate)


app.use(pinia)
app.use(router)
app.use(ElementPlus)


//挂在vue实列
app.mount('#app')


//引入pinia-plugin-persistedstate
// import piniaPluginPersistedstate from 'pinia-plugin-persistedstate'
// import { createApp } from 'vue'


// import ElementPlus from 'element-plus'
// import 'element-plus/dist/index.css'


// import App from './App.vue'
// import router from './router'
// import { createPinia } from 'pinia'
// //引入pinia
// const pinia = createPinia()
// pinia.use(piniaPluginPersistedstate)


// const app = createApp(App)
// app.use(pinia)
// app.use(router)
// app.use(ElementPlus)
// app.mount('#app')