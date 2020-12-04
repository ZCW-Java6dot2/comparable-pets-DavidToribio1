package io.zipcoder;

public class Hamster extends Pet {

    public Hamster(String name){
        super(name);
        this.setType("hamster");

    }



    @Override
    public static String speak(){
        return "squeak";
    }
}
