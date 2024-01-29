package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        Zoo zoo = new Zoo();

        System.out.println("Anna eläintarhalle nimi:");
        String zooname = sc.nextLine();

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i){
                    case 1:
                     System.out.println("Mikä laji?");
                     String specie = sc.nextLine();
                     System.out.println("Anna eläimen nimi:");
                     String name = sc.nextLine();
                     System.out.println("Anna eläimen ikä:");
                     int age = Integer.parseInt(sc.nextLine());
                     zoo.addanimal(specie, name, age);
                     break;
                    case 2:
                     System.out.println(zooname+" pitää sisällään seuraavat eläimet:");
                     zoo.listanimals();
                     break;
                    case 3:
                     System.out.println("Kuinka monta kierrosta?");
                     int laps = Integer.parseInt(sc.nextLine());
                     zoo.running(laps);
                     break;
                    case 0:
                     System.out.println("Kiitos ohjelman käytöstä.");
                     exit = true;
                     break;
                    default:
                     System.out.println("Syöte oli väärä");
                     break;
                }
            }
        }
        sc.close();
    }

}