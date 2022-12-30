package org.example.task.third;

public interface Interface2 {

    default void defaultMethod() {
        System.out.println("default 2");
        privateMethod();
    }

    public static void staticMethod() {
        System.out.println("static 2");
    }

    private void privateMethod() {
        System.out.println("private 2");
    }

}
