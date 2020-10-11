import java.util.Comparator;

public class SexComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStringSex().compareTo(o2.getStringSex());
    }
}
