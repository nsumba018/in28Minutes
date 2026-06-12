import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionsRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Range"), new Student(100, "Herve"), new Student(99, "Nsumba"));
        System.out.println(students);
        ArrayList<Student> studentsAll = new ArrayList<>(students);
        Collections.sort(studentsAll);
        System.out.println(studentsAll);
    }
}
