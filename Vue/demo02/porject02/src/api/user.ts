import request from '@/utils/request';
export const userListApi=(data:object)=>request.post(`/user`,data)