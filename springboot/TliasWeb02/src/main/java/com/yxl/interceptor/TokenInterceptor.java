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
        log.info("方法preHandle执行了-----------");
        String token = request.getHeader("token");
        Map<String,Object> map = JwtUtils.parseJWT(token);
        if (ObjectUtils.isEmpty(token) || map==null){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            log.info("令牌不合法不放行-----------");
            return false;
        }
        log.info("令牌合法放行-----------");
        Integer id = Integer.valueOf(map.get("id").toString());
        CurrentHolder.setCurrentId(id);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("方法执行结束---数据渲染完毕----可以清理暂存数据----");
        CurrentHolder.remove();
    }
}
