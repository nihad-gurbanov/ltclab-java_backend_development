package lesson16.RegistrationSystem;

class Participant {
    private String name;
    private int age;
    private String email;

    public Participant(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Email: " + email + "\n";
    }
}

