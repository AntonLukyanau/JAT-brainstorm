package org.example.task.third;

public class MyClass implements Interface1, Interface2{

    @Override
    public void defaultMethod() {
        Interface1.super.defaultMethod();
    }

}
