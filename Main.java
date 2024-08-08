// Class definition
class Animal {
    // Fields (Attributes)
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method show name
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method meaw
    void displayHong() {
        System.out.println("Hong Hong");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Animal class
        Animal dog = new Animal("Buddy", 3);
        Animal cat = new Animal("Folk",5);

        // Calling method on the object
        dog.displayHong();
        dog.displayInfo();
        cat.displayInfo();
    }
}