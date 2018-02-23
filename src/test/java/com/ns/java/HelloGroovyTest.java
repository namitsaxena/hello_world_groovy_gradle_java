package com.ns.java;

import org.junit.Assert;
import org.junit.Test;
import com.namitsaxena.examples.groovy.HelloGroovy;

public class HelloGroovyTest {
    
	@Test
    public void testHelloGroovyTest() 
    {
        HelloGroovy hello = new HelloGroovy();
        //System.out.println("Output:" + hello.hello("Test"));
        Assert.assertTrue("Hello Test from Groovy".equals(hello.hello("Test")));
    }

}
