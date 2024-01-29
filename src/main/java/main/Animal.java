package main;

public class Animal {
    public String specie;
    public String name;
    public int age;

    public Animal(){}

    public Animal(String specie, String name, int age){
        this.specie=specie;
        this.name=name;
        this.age=age;
    }
    public void printInformation(){
        System.out.println(specie + ": " + name + ", " + age + " vuotta");
    }
    public void run(int laps){
            for (int i = 1; i<=laps; i++){
            System.out.println(name + " juoksee kovaa vauhtia!");
    }
}
}