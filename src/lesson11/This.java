package lesson11;

public class This {
    /*
    In Java, the this keyword is used to refer to the current instance of a class.
    It can be used within a method or constructor of a class to refer to the
    current object. The primary purposes of the this keyword in Java are:

    To differentiate between instance variables and local variables/parameters:
    When a method or constructor parameter has the same name as an instance
    variable, the this keyword can be used to refer to the instance variable.
    This helps to avoid ambiguity and ensures that the correct variable is accessed.

    To invoke current class constructors: The this keyword can be used to call one
    constructor from another constructor in the same class. This is known as
    constructor chaining.

    To pass the current object as an argument to other methods: The this keyword
    can be used to pass the current object as an argument to other methods.
    */
    private int value;

    public This(int value) {
        // Using 'this' to distinguish between instance variable and method parameter
        this.value = value;
    }

    public void printValue(int value) {
        // Using 'this' to access the instance variable
        System.out.println("Instance variable value: " + this.value);
        // Using 'this' is optional here but it's clear and explicit
        System.out.println("Method parameter value: " + value);
    }

    public static void main(String[] args) {
        This obj = new This(10);
        obj.printValue(20);
    }
}