import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // אי אפשר ליצור אובייקטים ממחלקה אבסטרקטית

        Worker worker = new Worker("John", "Parker", "Electric");

        worker.printIntroduction(worker);

        Student student = new Student("David", "Hall", "first");

        student.printIntroduction(student);

        Athlete athlete = new Athlete("Jack", "Levi", "Football");


        Person[] people = new Person[3];
        people[0] = worker;
        people[1] = student;
        people[2] = athlete;


        for (int i = 0; i < people.length; i++) {

            System.out.println(Arrays.toString(people));
        }


    }
}