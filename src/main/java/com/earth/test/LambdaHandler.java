package com.earth.test;

import com.amazonaws.services.lambda.runtime.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LambdaHandler {

    private static final Logger LOG = LoggerFactory.getLogger(LambdaHandler.class);

    public Object handle(Object payload, Context context) {
        return handle(payload);
    }

    protected Object handle(Object payload){
        LOG.debug("payload : {}", payload);
        return payload;
    }
}
