package inheritance;

public class Dog extends Animal{

    public void sleep(){
        System.out.println("I sleep for 8 hrs only");
    }

    @Override
    public void color() {
        System.out.println("color of the dog is white");
    }
}
