package lesson22.CastingAgency;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieCasting {
    public static void main(String[] args) {

        List<Actor> actorList = new ArrayList<>();
        Actor actor1 = new Actor("John Doe", 34, 82);
        Actor actor2 = new Actor("Jane Smith", 40, 88);
        Actor actor3 = new Actor("Sam Lee", 28, 55);
        Actor actor4 = new Actor("Lucy Liu", 50, 93);
        Actor actor5 = new Actor("Mike Brown", 32, 65);

        actorList.add(actor1);
        actorList.add(actor2);
        actorList.add(actor3);
        actorList.add(actor4);
        actorList.add(actor5);

        List<Role> roleList = new ArrayList<>();
        Role role1 = new Role("Hero", 35, 80);
        Role role2 = new Role("Villain", 45, 85);
        Role role3 = new Role("Sidekick", 25, 50);
        Role role4 = new Role("Mentor", 55, 90);
        Role role5 = new Role("Comic Relief", 30, 60);

        roleList.add(role1);
        roleList.add(role2);
        roleList.add(role3);
        roleList.add(role4);
        roleList.add(role5);

        actorList.sort(Comparator.comparingInt(Actor::getActingSkill).thenComparingInt(Actor::getAge));
        roleList.sort(Comparator.comparingInt(Role::getExpectedAge).thenComparingInt(Role::getExpectedAge));

        for (Actor actor: actorList) {
            System.out.println(actor.name + " " + actor.age + " " + actor.actingSkill);
        };

        System.out.println();

        for (Role role: roleList) {
            System.out.println(role.name + " " + role.expectedAge + " " + role.minSkill);
        };

    }
}