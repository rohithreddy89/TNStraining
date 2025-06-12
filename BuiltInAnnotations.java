package com.tns.kprit.annotations;

public class BuiltInAnnotations {

	void show() {
        System.out.println("Parent method");
    }
}
class Child extends BuiltInAnnotations {
    @Override
    void show() {
        System.out.println("Child method");
    }
}
