package com.day01;

import junit.framework.Assert;

public class DemoTest {
    public void testSay(){
        Demo d = new Demo();
        String ret = d.say("Maven");
        Assert.assertEquals("hello Maven", ret);
    }
}
