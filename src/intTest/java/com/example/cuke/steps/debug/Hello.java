package com.example.cuke.steps.debug;

public class Hello {
    private final String greeting;

    public Hello(String greeting) {
        this.greeting = greeting;
    }

    public String sayHi() {
        return greeting + " World";
    }
}
