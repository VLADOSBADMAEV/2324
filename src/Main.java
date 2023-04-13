import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Владислав", " Николай Николаевич", 26));
        people.add(new Person("Роксана", "Манджеева", 20));
        people.add(new Person("Виктория", "Аравийская", 47));
        people.add(new Person("Александр", "Тюрбанов", 45));
        Collections.sort(people, new PersonComparator());
        System.out.println(people);



        ;
    }
}