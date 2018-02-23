package com.namitsaxena.examples.groovy

class HelloGroovy {
	def String hello(name = 'Groovy')
	{
		def msg = "Hello ${name} from Groovy"
		//println msg
		return msg
	}
}
