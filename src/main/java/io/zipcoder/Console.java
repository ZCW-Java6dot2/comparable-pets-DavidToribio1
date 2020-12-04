package io.zipcoder;

import io.zipcoder.Cat;
import io.zipcoder.Dog;
import io.zipcoder.Hamster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Console {
    public Scanner scan = new Scanner(System.in);
    public Integer numberOfPets;
    public String type;
    public String name;
    public ArrayList<Pet> petsContainer = new ArrayList<Pet>();

    public String getInput(String prompt){
        System.out.print(prompt);
        scan.nextLine();
        return scan.next();
        
    }

    public Integer getNumberOfPets(){
        System.out.print("How many pets do you have");
        numberOfPets = scan.nextInt();
        return numberOfPets;
    }

    public ArrayList<Pet> getPetsInput(Integer numberOfPets){
        ArrayList<Pet> newPets = new ArrayList<Pet>();
        for (int i=0; i<numberOfPets; i++){
            type = (getInput("What type is your pet: dog, cat, or hamster?  ")).toLowerCase();
            name = (getInput("Enter this pet's name:  "));
            if (type.equals("dog")){
                Dog dog = new Dog(name);
                newPets.add(dog);
            } else if (type.equals("cat")){
                Cat cat = new Cat(name);
                newPets.add(cat);
            } else if (type.equals("bunny")){
                Hamster hamster = new Hamster(name);
                newPets.add(hamster);
            }
        }
        this.petsContainer = newPets;
        return newPets;
    }
    public void printListOfPets (ArrayList<Pet> listPets){
        System.out.println("List of your" +listPets.size()+ "pets:\n");
        for (Pet p : listPets){
            System.out.println("\n" + (p.getName()) + " says " + (p.speak()));
        }
    }

    public void setPetsContainer(ArrayList<Pet> PetsContainer){
        this.petsContainer = petsContainer;

    }
    public ArrayList<Pet> getPetsContainer(){
        return this.petsContainer;
    }

    public void sortByType(){
        Comparator<Pet> comparator = Comparator.comparing(Pet::getType);
        Collections.sort(getPetsContainer(),comparator);

    }

}
