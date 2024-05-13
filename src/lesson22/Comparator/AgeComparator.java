package lesson22.Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
//        multiple criteria selection
        if (o1.age - o2.age == 0) {
            return o1.name.compareTo(o2.name);
        }
        return o1.age.compareTo(o2.age);
    }
}
