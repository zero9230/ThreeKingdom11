package nianyang.mny.service;

import javax.annotation.PostConstruct;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author sikou
 * @date 2021/02/06
 */
@Service
@Slf4j
public class JedisPoolServiceImpl implements JedisPoolService{

    private GenericObjectPoolConfig poolConfig;

    private JedisPool jedisPool;
    @PostConstruct
    private void init(){
        poolConfig=new GenericObjectPoolConfig();
        jedisPool=new JedisPool(poolConfig,"127.0.0.1",6379);
    }

    @Override
    public Jedis getJedis(){
        Jedis jedis=null;
        try {
            jedis=jedisPool.getResource();
        }catch (Exception e){
            log.error("nianyang.mny.service.JedisPoolServiceImpl.getJedis error!"+e);
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return jedis;
    }

    @Override
    public String get(String key){
        String res=null;
        try{
            res=getJedis().get(key);
        }catch (Exception e){
            log.error("nianyang.mny.service.JedisPoolServiceImpl.get error!key={},e={}",key,e);
        }
        return res;

    }

}
