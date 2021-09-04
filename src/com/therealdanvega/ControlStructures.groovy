package com.therealdanvega

if(true)
    println "Value is true"

if(false)
    println "Value is true"
else
    println "Value is false"

String name = null
if(name)
    println "name has a value"
else
    println "name is null"

name = "Dan"
if(name)
    println "name has a value"
else
    println "name is null"

String last = ""
if(last)
    println "last has a value"
else
    println "last is empty"

last = "Vega"
if(last)
    println "last has a value"
else
    println "last is empty"

//classic while
def i = 1
while (i < 5) {
    println i
    i++
}
//for in list
def list = [1,2,3,4]
for(num in list) {
    println num
}
//closure
def list2 = [5,6,7,8]
list2.each {println it}
//switch
def myNumber = 1
switch (myNumber) {
    case 1:
        println "Number is 1"
        break
    default:
        println "we hit the deault case"
}