package lesson11;

public class Person {
    /*
    Method:

    A method in Java is a block of code that performs a specific task or action.
    Methods are declared within a class and are invoked (called) to perform operations on the objects of that class.
    They can have a return type (void if no return value) and can accept parameters.
    Methods can be called multiple times within a program.
    Methods can be public, private, protected, or have default (package-private) access modifiers.
    Examples of methods include calculateArea() in a Rectangle class, displayInfo() in a Person class, etc.
    Constructor:

    A constructor in Java is a special type of method that is invoked when an object of a class is created.
    Constructors have the same name as the class and do not have a return type, not even void.
    Constructors are used to initialize the newly created object with initial values or perform any necessary setup.
    They are called implicitly when an object is instantiated using the new keyword.
    Constructors can be overloaded, allowing multiple constructors with different parameter lists within the same class.
    Constructors are often used to set initial values to instance variables or to perform other initialization tasks.
    Constructors can also have access modifiers like public, private, protected, or default (package-private).
    If a class does not define any constructors, Java provides a default constructor (with no parameters and no
    initialization code) automatically.

     */
    private final String name;
    private final int age;

    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of the Person class using the constructor
        Person person1 = new Person("John", 30);

        // Calling the method to display information
        person1.displayInfo();
    }
}

