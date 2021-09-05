package com.therealdanvega.domain

@groovy.transform.ToString()
class User {

    Long id
    String firstName
    String lasttName
    String email
    Date dob

    void printFullName() {
        println "FullName: $firstName $lasttName"
    }

}
