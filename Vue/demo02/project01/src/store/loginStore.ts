// 引入pinia、登录API、ElementPlus
import { defineStore } from 'pinia'
import { loginApi } from '@/api/login'
import { ElMessage } from 'element-plus'
import { ref, computed } from 'vue'

// 创建store
export const useUserStore = defineStore('userLoginInfo', () => {
    // 定义响应式状态
    const token = ref<string | null>(null)
    const isLogin = ref(false)

    // 计算属性
    const getToken = computed(() => token.value)
    const isAuthenticated = computed(() => !!token.value)

    // 操作方法
    const userLogin = async (account: string, password: string) => {
        const loginData = { username: account, password }
        const result = await loginApi(loginData) as any
        
        if (result.code === 1) {
            token.value = result.data
            isLogin.value = true
            ElMessage({
                showClose: true,
                message: result.msg,
                type: 'success',
            })
            return result
        } else {
            ElMessage({
                showClose: true,
                message: result.msg,
                type: 'error',
            })
            return { code: 0, msg: '系统错误' }
        }
    }

    const loginOut = () => {
        token.value = null
        isLogin.value = false
        ElMessage({
            showClose: true,
            message: '登出成功',
            type: 'success',
        })
    }

    return {
        token,
        isLogin,
        getToken,
        isAuthenticated,
        userLogin,
        loginOut
    }
},
 {
    persist: true
})


// //引入pinia、登录API、ElementPlus
// import { defineStore } from 'pinia'
// import { loginApi } from '@/api/login'
// import { ElMessage } from 'element-plus'

// //创建store
// export const useUserStore = defineStore('userLoginInfo', {
//     //定义登录状态及登录信息
//     state: () => ({
//         // user:{
//         //     userName: '' as String,
//         //     account:'' as String,
//         //     roles:[] as any
//         // },
//         token: null as string | null,  // 明确类型为 string | null
//         isLogin: false
//     }),

//     //获取用户信息
//     getters: {
//         // getUser: (state)=> state.user,
//         // getLoginStatus:(state)=> state.isLogin,
//         // getUserName:(state)=>state.user?.userName || 'admin',
//         getToken: (state) => state.token,
//         isAuthenticated: (state) => !!state.token  // 新增：直接通过token判断是否认证
//     },

//     //定义操作方法
//     actions: {
//         //登录方法
//         async userLogin(account: String, password: String) {
//             //调用登录方法
//             let loginData = { 'username': account, 'password': password }
//             let result = await loginApi(loginData) as any;
//             console.log(result)
//             //登录成功
//             if (result.code == 1) { 
//                 this.token = result.data
//                 this.isLogin = true
//                 //信息提示
//                 ElMessage({
//                     showClose: true,
//                     message: result.msg,
//                     type: 'success',
//                 })
//                  return result // 关键点：返回完整响应结果
//             } else {
//                 //登录失败，提示错误信息
                
//                 ElMessage({
//                     showClose: true,
//                     message: result.msg,
//                     type: 'error',
//                 })
//                  return { code: 0, msg: '系统错误' } // 统一错误格式
//             }
//         },

//         //注销方法
//         loginOut() {

//             this.token = null
//             this.isLogin = false
        
//             // this.user={
//             //     userName:'',
//             //     account:'',
//             //     roles:[]
//             // },
//             // this.isLogin=false
//             // this.token=null

//             //信息提示
//             ElMessage({
//                 showClose: true,
//                 message: '登出成功',
//                 type: 'success',
//             })
//         }
//     },
//     //持久化配置
//       persist: true,
// }
// )