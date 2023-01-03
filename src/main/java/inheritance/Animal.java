package inheritance;

public abstract class Animal {

    /**
     * We use Inheritance when there is similarity between classes
     * We don't use Inheritance when there is code reusability but when there IS-A relationship.
     * Object with Parent reference type --> It gives the liberty to create the required child object at run time.
     * Method in parent class --> If child has a different implementation then we can define that method as abstract
     * and can override the method.Which is called as method overriding or dynamic polymorphism.
     */


    public int numberOfYears = 2;

    public void eat() {
        System.out.println("Animals eats food");
    }

    public void run(){
        System.out.println("Animals start running");
    }

    public abstract void color();




}
