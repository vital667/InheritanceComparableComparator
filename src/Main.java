import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>(Arrays.asList(
                new Employee("Jan","Kowalski",40),
                new Employee("John","Walter",30),
                new Employee("Tom","Waits",20),
                new Employee("Adam","Kowalski",45),
                new Employee("Vit","667",23)
        ));

        System.out.println("Sorted By Age:");
        Collections.sort(list);
        list.forEach(System.out::println);

        System.out.println("Sorted by Surname/name:");
        Collections.sort(list, Person.comparatorSurname());
        list.forEach(System.out::println);
    }
}
