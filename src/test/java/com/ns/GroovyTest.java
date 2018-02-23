package com.ns;

import java.text.ParseException;

import junit.framework.Assert;

import org.junit.Test;

import com.namitsaxena.examples.groovy.HelloGroovy;

public class GroovyTest {
    @Test
    public void helloGroovyTest() throws ParseException
    {
        HelloGroovy hello = new HelloGroovy();
        System.out.println("Output:" + hello.hello("Test"));
        Assert.assertTrue("Hello Test from Groovy".equals(hello.hello("Test")));
    }

}
