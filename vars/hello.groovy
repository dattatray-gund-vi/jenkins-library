#!usr/bin/env groovy
import com.example.mjsl.Hello

//@Library('main.java.com.example.hello.HelloWorld')

//@Grab('com.jenkins-cd:groovy-cps:1.27')

def call() {
    println("Hello, World!")

    script {

        Hello hello = new Hello()
        String greet = hello.sayHello()
        println(greet)
    }


    script {
        def hello = new main.groovy.com.example.hello.HelloWorld()
        String greet = hello.sayHello()
        println(greet)
    }

//    script {
//
//        def obj = library('jenkins-library').main.java.com.example.jhello.HelloMyWorld()
//        String greet = obj.sayHello()
//        println(greet)
//    }

  //  println(hello.sayHello())
}