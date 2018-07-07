package com.roachfu.app.util.id;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * @author roach
 * @date 2018/7/7 11:25
 */
public class IdGenUtilsTest {

    @Test
    public void testNextId(){
        IdGenUtils idWorker = IdGenUtils.getFlowIdWorkerInstance();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 20000; i++) {
            System.out.println("---------------" + i);
            String orderCode = DateFormatUtils.format(new Date(), "yyyyMMdd") + idWorker.nextId();
            System.out.println(orderCode);
            set.add(orderCode);
        }
        System.out.println(set.size());
    }


}