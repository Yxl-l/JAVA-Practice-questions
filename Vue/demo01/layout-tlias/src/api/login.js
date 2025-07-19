// axios，导入axios
import request from '@/utils/request'

// 登录方法
export const loginApi=(data)=>request.post(`/login`,data)
