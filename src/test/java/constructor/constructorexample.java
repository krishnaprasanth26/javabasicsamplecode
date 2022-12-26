package constructor;

public class constructorexample {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.ageOfEmployee();
        employee.nameOfTheCompany();

        System.out.println('\n');

        /**
         * Example of constructor overloading.
         */
        Employee testEngineer = new Employee(1,"Gopal","Dinesh",true);
        System.out.println("Test Engineer test id: "+testEngineer.id);
        System.out.println("Test Engineer first name: "+testEngineer.firstName);
        System.out.println("Test Engineer second name: "+testEngineer.secondName);
        System.out.println("Test Engineer permanent employee: "+testEngineer.isPermanentEmployee);

        /**
         * anonymous object --> nameless or variable less object.
         * This is an example that shows constructor doesn't return anything explicitly, but returns the object of the
         * current class.
         * In the below example, we can use the anonymous object only once.
         */
        new Employee().nameOfTheCompany();



    }
}
