package com.imooc;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by seal on 7/13/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j

public class LoggerTest {

    private Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        log.debug("debug...");
        log.info("info....");
        log.error("error...");
    }


}
