// 导入axios
import request from '@/utils/request'

// 创建分页查询方法  拼接路径，并导出方法
export const queryPageApi=(name,gender,begin,end,currentPage,pageSize)=>request.get(`/emps?name=${name}&gender=${gender}&begin=${begin}&end=${end}&page=${currentPage}&pageSize=${pageSize}`)

// 新增员工方法
export const addEmpApi=(data)=>request.post(`/emps`,data)
//回显根据id查询员工
export const getEmpByIdApi=(id)=>request.get(`/emps/${id}`)
// 修改员工方法
export const updateEmpById=(data)=>request.put(`/emps`,data)
//批量删除
export const deleteEmpApi=(ids)=>request.delete(`/emps?ids=${ids}`)
