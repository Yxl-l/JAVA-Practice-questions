import request from '@/utils/request';

export const loginApi=(data : object)=>request.post(`/user/login`,data)

