package nianyang.mny.controller;

import nianyang.mny.service.JedisPoolService;
import nianyang.mny.service.JedisPoolServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

/**
 * @author sikou
 * @date 2021/01/30
 */
@Controller
@RequestMapping("/redis")
public class RedisStringController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private JedisPoolService jedisPoolService;

    @RequestMapping("/setget.html")
    public @ResponseBody String env(String param) throws Exception{
        redisTemplate.opsForValue().set("testEnv",param);
        String str= redisTemplate.opsForValue().get("testEnv");
        return str;
    }

    @RequestMapping("/getRedisString/key={key}")
    @ResponseBody
    public String getRedisString(@PathVariable String key){
        String str= jedisPoolService.get(key);
        return str;
    }

    @RequestMapping("/getRedis")
    @ResponseBody
    public Jedis getRedis(){
        Jedis str= jedisPoolService.getJedis();
        return str;
    }

}
