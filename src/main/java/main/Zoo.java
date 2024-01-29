package main;

import java.util.Scanner;
import java.util.ArrayList;

public class Zoo {

    Scanner sc = new Scanner(System.in);
    Animal animal = new Animal();
    public ArrayList<Animal> animals = new ArrayList<>();

    public void addanimal(){
        System.out.println("Mikä laji?");
        String specie = sc.nextLine();
        System.out.println("Anna eläimen nimi:");
        String name = sc.nextLine();
        System.out.println("Anna eläimen ikä:");
        int age = Integer.parseInt(sc.nextLine());

        animal = new Animal(specie, name, age);
        animals.add(animal);
        }

    public void listanimals(){
        for(Animal animal : animals){
            animal.printInformation();
        }
    }
    public void running(){
        System.out.println("Kuinka monta kierrosta?");
        int laps = Integer.parseInt(sc.nextLine());
        for(Animal animal : animals){
            animal.run(laps);
     }
    }
}