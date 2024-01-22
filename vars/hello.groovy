#!usr/bin/env groovy

import example.mjsl.Hello

def hello = new Hello()

def call() {
    println("Hello, World!")
    println(hello.sayHello())
}