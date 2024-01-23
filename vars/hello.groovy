#!usr/bin/env groovy
import com.example.mjsl.Hello


//@Grab('com.jenkins-cd:groovy-cps:1.27')

def call() {
    println("Hello, World!")

    script {

        Hello hello = new Hello()
        String greet = hello.sayHello()
        println(greet)
    }


    script {
        def hello = new com.example.hello.HelloWorld()
        String greet = hello.sayHello()
        println(greet)
    }

  //  println(hello.sayHello())
}