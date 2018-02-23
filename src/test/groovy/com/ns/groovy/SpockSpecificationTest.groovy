package com.ns.groovy

import static org.junit.Assert.*
import com.namitsaxena.examples.groovy.HelloGroovy
import org.junit.Test
import spock.lang.Specification

class SpockSpecificationTest extends Specification {

	def "hello returns correct response"() {
		given:
			HelloGroovy hello = new HelloGroovy()
			int left = 2
			int right = 2
	 
		expect:
			hello.hello("Spock") == "Hello Spock from Groovy"
	}
}
