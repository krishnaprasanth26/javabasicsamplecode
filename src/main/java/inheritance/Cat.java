package inheritance;

public class Cat extends Animal{

    public void sleep(){
        System.out.println("I sleep for 12 hrs");
    }

    @Override
    public void color() {
        System.out.println("Color of the cat is golden brown");
    }
}
