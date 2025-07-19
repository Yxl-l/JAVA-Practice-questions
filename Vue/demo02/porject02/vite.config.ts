import { fileURLToPath, URL } from 'node:url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import vueDevTools from 'vite-plugin-vue-devtools'

// https://vite.dev/config/
export default defineConfig({
  plugins: [
    vue(),
    vueDevTools(),
  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    },
  },
  server: {
    proxy: {
      // 匹配所有以/api开始的路径
      '/api': {
        // 将以/api开始的请求，交给http://localhost:8080    比如  /api/depts-> http://localhost:8080/api/depts
        target: 'http://localhost:8080',
        // 是否开启ssl安全管理(忽略)
        secure: false,
        // 跨域配置
        changeOrigin: true,
        // 将请求路径中的/api替换成空/api/depts-> http://localhost:8080/api/depts->http://localhost:8080/depts
        rewrite: (path) => path.replace(/^\/api/, ''),
      }
    }
  }
})
