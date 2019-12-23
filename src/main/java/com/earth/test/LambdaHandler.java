package com.earth.test;

import com.amazonaws.services.lambda.runtime.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LambdaHandler {

    private static final Logger LOG = LoggerFactory.getLogger(LambdaHandler.class);

    public LambdaHandler(){
        LOG.info("TEST_ENV_PROPERTY", System.getProperty("TEST_ENV_PROPERTY"));
    }

    public Object handle(Object payload, Context context) {
        return handle((String) payload);
    }

    protected Object handle(String payload){
        LOG.debug("payload : {}", payload);
        return payload;
    }
}
