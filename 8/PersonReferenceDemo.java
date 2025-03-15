class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class PersonReferenceDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        System.out.println("Before assignment:");
        System.out.println("person1 name: " + person1.name);
        System.out.println("person2 name: " + person2.name);

        person2 = person1;

        System.out.println("\nAfter assignment:");
        System.out.println("person1 name: " + person1.name);
        System.out.println("person2 name: " + person2.name);

        person2.name = "Charlie";

        System.out.println("\nAfter modifying person2's name:");
        System.out.println("person1 name: " + person1.name);
        System.out.println("person2 name: " + person2.name);
    }
}
