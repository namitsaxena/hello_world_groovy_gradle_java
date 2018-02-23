package com.ns.groovy
import com.namitsaxena.examples.groovy.HelloGroovy

class GroovyHelloTest extends GroovyTestCase{

	public void testGroovyHello() {
		HelloGroovy hello = new HelloGroovy();
		assert hello.hello() == "Hello Groovy from Groovy"
	}

}
