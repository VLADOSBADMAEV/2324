import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int a = p1.getSurname().split(" ").length;
        int b = p2.getSurname().split(" ").length;

        if (a != b) {
            return Integer.compare(a, b);
        }
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
