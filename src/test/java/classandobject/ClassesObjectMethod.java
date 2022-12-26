package classandobject;

public class ClassesObjectMethod {

    public static void main(String[] args) {
        Cars skoda = new Cars();
        skoda.setNameOfTheCar("Slavia");
        System.out.println("The below are the details of "+skoda.getNameOfTheCar());
        skoda.configurationOfTheCar();
        skoda.topSpeedOfTheCar();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Cars volkswagen = new Cars();
        volkswagen.setNameOfTheCar("Virtus");
        System.out.println("The below are the details of "+volkswagen.getNameOfTheCar());
        volkswagen.configurationOfTheCar();
        volkswagen.topSpeedOfTheCar();



    }
}
