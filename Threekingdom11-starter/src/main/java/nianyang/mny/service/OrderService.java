package nianyang.mny.service;

import java.util.concurrent.TimeUnit;

import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sikou
 * @date 2021/02/12
 */
@Service
@Slf4j
public class OrderService {

    @Autowired
    private CuratorFramework zkClient;

    private static final String LOCK_PATH ="/lock/order";

    //
    public void makeOrderType(String type){
        String path= LOCK_PATH +"/"+type;

        log.info("try to do lock , path={},type={}",path,type);
        try{
            InterProcessMutex lock=new InterProcessMutex(zkClient,path);
            if(lock.acquire(10, TimeUnit.HOURS)){
                try{
                    Thread.sleep(10);
                    log.info("do job {} done",type);
                }finally {
                    lock.release();
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }


}
