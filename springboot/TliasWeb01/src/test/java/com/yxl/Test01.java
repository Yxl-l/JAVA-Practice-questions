package com.yxl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class Test01 {
    @Test
    void testGenJwt() {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", 10);
        claims.put("username", "yxl");

        String jwt = Jwts.builder().signWith(SignatureAlgorithm.HS256, "uvibaiugefouaeboae")
                .addClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + 12 * 3600 * 1000))
                .compact();

        System.out.println(jwt);
    }
    @Test
    public void testParseJwt() {
        Claims claims = Jwts.parser().setSigningKey("uvibaiugefouaeboae")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MTAsInVzZXJuYW1lIjoieXhsIiwiZXhwIjoxNzUxMzk2NTU4fQ.0YOPZdoXfKossustr7CiRES10NvP2FUxpET54KeZtDM")
                .getBody();
        System.out.println(claims);
    }
}