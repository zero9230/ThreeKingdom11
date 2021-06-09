package nianyang.mny.demo;

import redis.clients.jedis.Jedis;

/**
 * @author sikou
 * @date 2021/01/30
 */
public class JedisDemo {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("localhost",6379);
        jedis.set("nihao","zhongguo");




    }

}
