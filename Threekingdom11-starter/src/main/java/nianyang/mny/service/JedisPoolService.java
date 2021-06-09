package nianyang.mny.service;

import redis.clients.jedis.Jedis;

/**
 * @author sikou
 * @date 2021/02/06
 */
public interface JedisPoolService {

    Jedis getJedis();

    String get(String key);

}
