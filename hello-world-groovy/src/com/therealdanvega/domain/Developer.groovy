package com.therealdanvega.domain
//Create toString method
@groovy.transform.ToString()
//by default all classes are public, so the keyword can be ommited
class Developer {
    //has getters and setters
    String first
    String last
    def languages = [] //type java.util.ArrayList

    //default public
    void work() {
        println "$first $last is working ..."
    }
}
