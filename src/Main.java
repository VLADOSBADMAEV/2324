import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;




public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();


        people.add(new Person("Владислав", " Николай Николаевич", 26));
        people.add(new Person("Роксана", "Манджеева", 20));
        people.add(new Person("Виктория", "Аравийская", 47));
        people.add(new Person("Александр", "Тюрбанов", 45));
        System.out.println(people);

        people.sort((p1, p2) -> {
            int a = p1.getSurname().split(" ").length;
            int b = p2.getSurname().split(" ").length;

            if (a != b) {
                return Integer.compare(a, b);
            }
            return Integer.compare(p1.getAge(), p2.getAge());

        });

    }
}
