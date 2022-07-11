package lesson11;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Ivan", 25);
        Person person1 = new Person("Ivan", 26);
        System.out.println(person.equals(person1));
        System.out.println(person.hashCode());

        String s = "hello";
        String s1 = "hello";
        System.out.println(s.equals(s1));

        System.out.println(person.getClass());

    }
}
