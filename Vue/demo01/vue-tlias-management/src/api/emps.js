// 导入axios
import request from '@/utils/request'

// 创建分页查询方法，并导出
export const queryPageApi=(page,pageSize,name,gender,begin,end)=> request.get(`/emps?page=${page}&pageSize=${pageSize}&name=${name}&gender=${gender}&begin=${begin}&end=${end}`)