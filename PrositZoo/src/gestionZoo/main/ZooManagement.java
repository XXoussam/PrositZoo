package gestionZoo.main;

import gestionZoo.entities.Animal;
import gestionZoo.entities.Dolphin;
import gestionZoo.entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {
        //PROSIT 2
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo();
        myZoo.setName("Wildlife Park");
        myZoo.setCity("Ariana");
        myZoo.setAnimals(new Animal[myZoo.getNbrCages()]);


        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        System.out.println("///////" + myZoo.isZooFull(myZoo.getNbrAnimals()));
        Zoo ze = new Zoo("kjel", "kjeflk");
        System.out.println("*****" + Zoo.compareZoo(myZoo, ze));

        System.out.println("---------------------------------------------------------------------------");


        Dolphin d1 = new Dolphin("Dolphin", "D1", 2, true, "Atlantic", 2);

        System.out.println(d1.toString());

    }


}
