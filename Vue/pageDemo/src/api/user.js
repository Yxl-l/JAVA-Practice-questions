import request from "@/utils/request"

export const getPageApi=(page,pageSize,name,gender,faction)=>request.get(`/user?page=${page}&pageSize=${pageSize}&name=${name}&gender=${gender}&faction=${faction}`)

export const loginApi = (data)=>request.post('/user/login',data)

