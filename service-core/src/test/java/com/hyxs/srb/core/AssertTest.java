package com.hyxs.srb.core;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class AssertTest {

    @Test
    public void test1(){
        Object o = null;
        if (o==null){
            //参数不合法异常
            throw new IllegalArgumentException("参数错误");
        }
    }

    @Test
    public void test2(){
        Object o = null;
        //用断言替代if
        Assert.notNull(o,"参数错误");
    }

}
