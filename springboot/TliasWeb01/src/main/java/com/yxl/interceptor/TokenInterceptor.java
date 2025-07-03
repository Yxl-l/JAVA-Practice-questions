package com.yxl.interceptor;

import com.yxl.utils.CurrentHolder;
import com.yxl.utils.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Slf4j
@Component
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       log.info("preHandle ... 执行了");
        String token = request.getHeader("token"); //3. 获取请求头中的令牌（token）。
        if(ObjectUtils.isEmpty(token) || JwtUtils.parseJWT(token)==null){
            response.setStatus(HttpStatus.SC_UNAUTHORIZED);
            log.info("令牌不合法不放行");
            return false;
        }
        log.info("令牌合法 放行");
        Map<String,Object> map = JwtUtils.parseJWT(token);
        Integer empId = Integer.valueOf(map.get("id").toString());
        CurrentHolder.setCurrentId(empId);
        return true;
    }

//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//       log.info("postHandle ... 方法执行完后清空当前线程绑定的id");
//       很少使用
//    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("afterCompletion ....方法执行完毕且数据渲染后清空当前线程绑定的id ");
        //7. 清空当前线程绑定的id
        CurrentHolder.remove();
    }
}
