package lesson22.CastingAgency;

public class Actor {
    String name;
    int age;
    int actingSkill;

    public Actor(String name, int age, int actingSkill) {
        this.name = name;
        this.age = age;
        this.actingSkill = actingSkill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getActingSkill() {
        return actingSkill;
    }

    public void setActingSkill(int actingSkill) {
        this.actingSkill = actingSkill;
    }
}
