// 导入request.js  @绝对路径，指src目录开始
import request from '@/utils/request'

//导出一个方法，查询所有部门
// 执行远程请求
export const queryAllApi=()=> request.get(`/depts`)

// 导出一个新增方法
export const addApi=(data)=>request.post(`/depts`,data)

// 根据ID查询部门信息
export const queryByIdApi=(id)=>request.get(`/depts/${id}`)

// 修改部门数据
export const updateByIdApi=(data)=>request.put(`/depts`,data)

// 根据ID删除
export const deleteByIdApi=(id)=>request.delete(`/depts?id=${id}`)