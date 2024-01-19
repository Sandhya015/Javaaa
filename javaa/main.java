
class Person {
    String name;
    int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class main {
    public static void main(String[] args) {
    
        Person person1 = new Person("Sandhya", 20);

        person1.displayInfo();
    }
}
