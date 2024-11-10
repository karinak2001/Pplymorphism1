public class Worker extends Person{

    private String workingPlace;

    public Worker(String firstName, String lastName, String workingPlace){
        super(firstName, lastName);
        this.workingPlace = workingPlace;
    }

    @Override
    public void introduceYourself(){
        System.out.println("Hi my name is " + this.getFullName() +
                " and I work as " + this.workingPlace);
    }

}
