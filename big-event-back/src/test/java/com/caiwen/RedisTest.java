package com.caiwen;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;

@SpringBootTest
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void TestSet() {
        //在Redis中存储一个键值对，StringRedisTemplate
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        operations.set("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGFpbXMiOnsiaWQiOjMsInVzZXJuYW1lIjoiY2Fpd2VuIn0sImV4cCI6MTcyMDEzMDM2MX0.KqxC1VcaaziWcNee42XIioZyd3z-qG9OcRMwedViwv4","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGFpbXMiOnsiaWQiOjMsInVzZXJuYW1lIjoiY2Fpd2VuIn0sImV4cCI6MTcyMDEzMDM2MX0.KqxC1VcaaziWcNee42XIioZyd3z-qG9OcRMwedViwv4");
        System.out.println(operations.get("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGFpbXMiOnsiaWQiOjMsInVzZXJuYW1lIjoiY2Fpd2VuIn0sImV4cCI6MTcyMDEzMDM2MX0.KqxC1VcaaziWcNee42XIioZyd3z-qG9OcRMwedViwv4"));

    }

    @Test
    public void testGet() {
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        System.out.println(operations.get("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGFpbXMiOnsiaWQiOjMsInVzZXJuYW1lIjoiY2Fpd2VuIn0sImV4cCI6MTcyMDEzMDM2MX0.KqxC1VcaaziWcNee42XIioZyd3z-qG9OcRMwedViwv4"));
    }
}
