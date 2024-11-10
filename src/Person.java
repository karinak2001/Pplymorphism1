public abstract class Person {
    private String firstName;
    private String lastName;


    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }


    public abstract void introduceYourself();


    public void printIntroduction(Person person){
        System.out.println("Meet the next person: ");
        person.introduceYourself();
    }
}
