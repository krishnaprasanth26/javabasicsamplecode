package inhertitance;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;

public class inheritancetest {

    public static void main(String[] args) {
        Dog dog = new Dog();
        // Below two methods and variables are inherited from the Parent Animal class.
        dog.eat();
        dog.run();
        System.out.println("dog.numberOfYears = " + dog.numberOfYears);
        //Below method is from the Dog class.
        dog.sleep();
        System.out.println('\n');

        // Second class
        Cat cat = new Cat();
        cat.eat();
        cat.run();
        System.out.println("cat.numberOfYears = " + cat.numberOfYears);
        cat.sleep();
        System.out.println('\n');
        // Child Object created with parent reference type. In the case user will be able to access only the Animal class
        // variables and methods.
        Animal pug = new Dog();
        System.out.println("pug.numberOfYears = " + pug.numberOfYears);
        pug.eat();
        pug.run();
        System.out.println('\n');

        Animal pet;
        pet = new Dog();
        pet.color();
        pet = new Cat();
        pet.color();
        System.out.println('\n');





    }
}
