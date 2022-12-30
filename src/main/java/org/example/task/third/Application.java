package org.example.task.third;

public class Application {
    public static void main(String[] args) {
        Interface1 instance = new MyClass();
        instance.defaultMethod();
        Interface1.staticMethod();
    }
}
