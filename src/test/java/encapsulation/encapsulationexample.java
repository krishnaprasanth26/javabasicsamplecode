package encapsulation;

public class encapsulationexample {

    public static void main(String[] args) {
        Student rajesh = new Student();
        rajesh.setAge(12);
        rajesh.setEmail("sarapambu@gmail.com");
        rajesh.getAge();
        rajesh.getEmail();

        System.out.println('\n');

       Student mohan = new Student();
        mohan.setAge(21);
        mohan.setEmail("SilkuJippa");
        mohan.getAge();
        mohan.getEmail();

    }
}
