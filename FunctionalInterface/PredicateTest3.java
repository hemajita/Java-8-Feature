package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest3 {
    String name;
    String role;

    PredicateTest3(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "PredicateTest3{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    String getName() {
        return name;
    }

    String getRole() {
        return role;

    }

    public static void main(String[] agrs) {
        List<PredicateTest3> users = new ArrayList<>();
        users.add(new PredicateTest3("Badal", "admin"));
        users.add(new PredicateTest3("Litu","member"));
    List admins=process(users,(PredicateTest3 p)->p.getName().equals("Badal"));
    System.out.println(admins);
    }

    public static List<PredicateTest3> process(List<PredicateTest3> users, Predicate<PredicateTest3> predicate) {
        List<PredicateTest3> list = new ArrayList<>();
        for (PredicateTest3 predicateTest3 : users)
            if (predicate.test(predicateTest3))
                list.add(predicateTest3);
        return list;

    }


}
