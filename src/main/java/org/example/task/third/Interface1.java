package org.example.task.third;

public interface Interface1 {

    default void defaultMethod() {
        System.out.println("default 1");
        privateMethod();
    }

    public static void staticMethod() {
        System.out.println("static 1");
    }

    private void privateMethod() {
        System.out.println("private 1");
    }

}
