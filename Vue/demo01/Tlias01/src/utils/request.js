// 导入axios
import axios from 'axios'

// 配置请求数据信息   
//	所有请求，都添加一个/api前部分路径
//  	所有请求，超时时间设置
const request = axios.create({
  baseURL: '/api',
  timeout: 10000
});

// 响应数据拦截器
//    任何地方使用axios执行远程调用，直接将后端返回的数据提取出来，返回给调用的地方
//    添加响应拦截器
request.interceptors.response.use(function (response) {
    return response.data;
  }, function (error) {
    // 超出 2xx 范围的状态码都会触发该函数。
    // 对响应错误做点什么
    return Promise.reject(error);
  })

// 导出axios组件
export default request