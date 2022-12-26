package constructor;

public class Employee {

    /** 1. Constructor is used to construct/create the object. It allocates memory space when the object is declared and
     *     initializes the variables.
     *  2. constructor will have the same name as class name.
     *  3. constructor doesn't have any explicit return type.But has implicitly returns the object created for the class.
     *  4. constructor is invoked implicitly.
     **/

    public int id;
    public String firstName;
    public String secondName;
    public int age;
    public String companyName;
    public boolean isPermanentEmployee;

    public Employee(){
        age = 21;
        companyName = "Kekurran Mekkuran";

    }

    public Employee(int id,String firstName,String secondName,boolean isPermanentEmployee) {
        this.id =id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.isPermanentEmployee = isPermanentEmployee;
    }


    public void ageOfEmployee(){
        System.out.println("Age : "+age);
    }

    public void nameOfTheCompany(){
        System.out.println("Company : "+companyName);
    }


}
