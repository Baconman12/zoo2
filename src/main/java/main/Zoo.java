package main;
import java.util.ArrayList;

public class Zoo {
    Animal animal = new Animal();
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addanimal(String specie, String name, int age){
        animal = new Animal(specie, name, age);
        animals.add(animal);
        }

    public void listanimals(){
        for(Animal animal : animals){
            animal.printInformation();
        }
    }
    public void running(int laps){
        for(Animal animal : animals){
            animal.run(laps);
     }
    }
}