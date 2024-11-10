import org.w3c.dom.ls.LSOutput;

public class Student extends Person{
    private String department;

    public Student(String firstName, String lastName, String department){
        super(firstName, lastName);
        this.department = department;
    }

    @Override
    public void introduceYourself(){
        System.out.println("Hi my name is " + this.getFullName() +
                " and I study at " + this.department + " department.");
    }
}
