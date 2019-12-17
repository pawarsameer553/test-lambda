package com.earth.test;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TestPOJO {

    private String test;

    public TestPOJO(){}

    public TestPOJO(String test){
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
