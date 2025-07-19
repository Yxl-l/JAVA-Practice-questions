// 引入request(axios)
import request from "@/utils/request"

// 获取部门列表  /api/depts
export const queryAll=()=>request.get("/depts")

// 新增部门数据
export const addApi=(data)=>request.post("/depts",data)

// 根据ID查询部门信息
export const queryByIdApi=(id)=>request.get(`/depts/${id}`)

// 修改方法
export const updateApi=(data)=>request.put("/depts",data)

// 删除部门
export const deleteApi=(id)=>request.delete(`/depts?id=${id}`)