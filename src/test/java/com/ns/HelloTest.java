package com.ns;

import org.junit.Test;

import com.namitsaxena.examples.HelloWorld;
import java.text.ParseException;

import junit.framework.Assert;



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
    public void helloTest() throws ParseException
    {
        HelloWorld hello = new HelloWorld();
        Assert.assertTrue(hello.hello("Test").equals("Hello Test!!!"));
    }
    
}
