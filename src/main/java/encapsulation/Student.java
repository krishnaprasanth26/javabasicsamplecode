package encapsulation;

public class Student {

    /** Encapsulation is grouping of data and method together in a class. Hiding data in order to prevent direct
     * access from outside.
     * Access through methods. Getter - Retrieve Information. Setter - Modify Information. It prevents wrong data to be
     * entered.
     **/

    public String fname;
    public int rollno;
    private int age;
    private String email;


    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Please provide a valid age");
        }

    }

    public void setEmail(String email) {
        if (email.endsWith("@gmail.com")) {
            this.email = email;
        } else {
            System.out.println("Please provide a valid email");
        }
    }

    public void getAge() {
        if(age != 0) {
            System.out.println(age);
        }

    }

    public void getEmail() {
        if (email != null) {
            System.out.println(email);
        }
    }


}





