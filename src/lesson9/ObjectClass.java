package lesson9;

public class ObjectClass {
    public static void main(String[] args) {
        // Creating two objects
        MyClass obj1 = new MyClass(1, "Object 1");
        MyClass obj2 = new MyClass(1, "Object 1");

        // Using equals() method to compare objects
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));

        // Using toString() method to print object information
        System.out.println("obj1.toString(): " + obj1.toString());

        // Using getClass() method to get the runtime class of the object
        System.out.println("obj1.getClass(): " + obj1.getClass());
    }
}

class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals() method to compare objects based on id and name
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        MyClass myClass = (MyClass) obj;
        return id == myClass.id && name.equals(myClass.name);
    }

    // Override toString() method to return object information
    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
