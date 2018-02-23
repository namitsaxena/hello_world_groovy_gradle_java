package com.ns.java;

import org.junit.Assert;
import org.junit.Test;

import com.namitsaxena.examples.HelloWorld;


/**
 * Unit test for simple App.
 */
public class HelloTest 
{
    /**
     * 
     * @throws ParseException 
     */
    @Test
    public void helloTest() 
    {
        HelloWorld hello = new HelloWorld();
        Assert.assertTrue(hello.hello("Test").equals("Hello Test!!!"));
    }
    
}
