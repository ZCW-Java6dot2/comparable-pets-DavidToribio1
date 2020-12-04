package io.zipcoder;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        this.setType("cat");
    }

    @Override
    public String speak() {
        return "Meow";

    }
}