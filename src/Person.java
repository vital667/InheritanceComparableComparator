import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private String surName;
    private int age;

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }

    static Comparator<Person> comparatorSurname() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.surName.compareTo(o2.surName)==0)
                    if (o1.name.equals(o2.name)) return 0;
                    else return o1.name.compareTo(o2.name);
                else return o1.surName.compareTo(o2.surName);

            }
        };
    }

    @Override
    public int compareTo(Person o) {
        if (age == o.age) return 0;
        return age > o.age ? 1 : -1;
    }
}