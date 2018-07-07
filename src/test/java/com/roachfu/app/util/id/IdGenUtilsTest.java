package com.roachfu.app.util.id;

import org.junit.Test;

/**
 * @author roach
 * @date 2018/7/7 18:08
 */
public class IdGenUtilsTest {

    @Test
    public void testNextId() {
        IdGenUtils idWorker = IdGenUtils.getFlowIdWorkerInstance();
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 20000; i++) {
            System.out.println(idWorker.nextId());
        }
    }

}
