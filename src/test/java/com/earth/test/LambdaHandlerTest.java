package com.earth.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LambdaHandlerTest {

    private static final Logger LOG = LoggerFactory.getLogger(LambdaHandlerTest.class);

    @Test
    public void test(){
        LambdaHandler lambdaHandler = new LambdaHandler();
        LOG.info("{}", lambdaHandler.handle("String"));
    }

}
