package classandobject;

public class Cars {

    /* What is a class - Class is a template for Object.
     * What is an Object - An Object is an instance of class.
     * eg. Class is like a blueprint for construction of house in a community and object in the actual house , like how
     * each house different address , objects have different space allocated in memory.
     */

    int lengthOfTheCar = 30;
    double fuelTankSize = 4500;
    String colorOfTheCar = "Red";
    int topspeed = 120;
    String nameOfTheCar = "";

    public String getNameOfTheCar() {
        return nameOfTheCar;
    }

    public void setNameOfTheCar(String nameOfTheCar) {
        this.nameOfTheCar = nameOfTheCar;
    }

    public void topSpeedOfTheCar(){
        System.out.println("topspeed = " + topspeed);
    }

    public void configurationOfTheCar(){
        System.out.println("lengthOfTheCar = " + lengthOfTheCar);
        System.out.println("fuelTankSize = " + fuelTankSize);
        System.out.println("colorOfTheCar = " + colorOfTheCar);

    }

}