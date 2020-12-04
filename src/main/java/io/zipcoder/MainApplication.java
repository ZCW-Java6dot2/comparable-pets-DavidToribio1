package io.zipcoder;


import java.util.ArrayList;

public class MainApplication {
    public static void main(String[] args){
        Console console = new Console();
        Integer numOfPets = console.getNumberOfPets();
        ArrayList<Pet> recivedPets = console.getPetsInput(numOfPets);
        console.printListOfPets(recivedPets);
    }
}
