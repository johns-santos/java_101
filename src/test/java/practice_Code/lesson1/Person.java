package practice_Code.lesson1;

import practice_Code.lesson2.Name;



public class Person { // instance member objects go between brackets

    // instance variable - can have more than 1
    private Name personName;

    // CONSTRUCTOR - used to initialize objects
    public Person(Name personName) {
       this.personName =  personName;
    }

    public Person () {
        // default constructor - leaving empty
    }


    // instance method - can have more than 1
    public String helloWorld() {
        return "Hello World";
    }

    public Name name() {
        return personName;
    }


    public String hello(String name) {
        return "Hello " + name;
    }

}
