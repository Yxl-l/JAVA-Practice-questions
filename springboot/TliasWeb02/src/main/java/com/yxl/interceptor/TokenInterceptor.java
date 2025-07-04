package com.yxl.interceptor;

import com.yxl.utils.CurrentHolder;
import com.yxl.utils.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Component
@Slf4j
public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        Map<String,Object> map = JwtUtils.parseJWT(token);
        if (ObjectUtils.isEmpty(token) || map==null){
            log.info("令牌非法不放行");
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }
        log.info("令牌合法放行");
        CurrentHolder.setId((Integer) map.get("id"));
        return true;

    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("afterCompletion ....方法执行完毕且数据渲染后清空当前线程暂存数据");
        //7. 清空当前线程绑定的id
        CurrentHolder.remove();
    }
}
