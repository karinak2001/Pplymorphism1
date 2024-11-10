public class Athlete extends Person{
    private String sport;

    public Athlete(String firstName, String lastName, String sport){
        super(firstName, lastName);
        this.sport = sport;
    }


    public void introduceYourself(){
        System.out.println("Hi me name is: " + this.getFullName() +
                " and I practice at " + this.sport);
    }
}
