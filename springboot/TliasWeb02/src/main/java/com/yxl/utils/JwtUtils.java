package com.yxl.utils;

import io.jsonwebtoken.*;

import java.util.Date;
import java.util.Map;

public class JwtUtils {
    private static String signKey = "CXKqeoufbaovbaeuofg";
    private static Long expire = 43200000L;
    /**
     * 生成JWT令牌
     */
    public static String generateJwt(Map<String,Object> map){
        return Jwts.builder()
                .addClaims(map)
                .signWith(SignatureAlgorithm.HS256,signKey)
                .setExpiration(new Date(System.currentTimeMillis()+expire))
                .compact();
    }

    /**
     * 解析JWT令牌
     */
    public static Map<String,Object> parseJWT(String jwt){
        Map map = null;
        try {
            map= Jwts.parser()
                .setSigningKey(signKey)
                .parseClaimsJws(jwt)
                .getBody();
        } catch (ExpiredJwtException e) {
        }
        return map;
    }
}
