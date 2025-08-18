package Priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Construct {

    private static class Student {
        int rollno;
        int marks;
        String name;
    }

    public static class StudentComparator implements Comparator<Student> {

        public int compare(Student s1, Student s2) {
            if (s1.marks > s2.marks) {
                return 1; // Higher marks → goes later in min-heap
            } else if (s1.marks < s2.marks) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Student bibek = new Student();
        bibek.marks = 90;
        bibek.name = "Bishnu";
        bibek.rollno = 45;

        Student james = new Student();
        james.marks = 89; // ✅ fixed (was wrongly assigned to bibek.marks)
        james.name = "Gede";
        james.rollno = 46;

        // ✅ Correct comparator object creation
        PriorityQueue<Student> s = new PriorityQueue<>(new StudentComparator());

        // ✅ Add students to the queue
        s.add(bibek);
        s.add(james);

        // ✅ Check if queue is not empty before accessing peek()
        if (!s.isEmpty()) {
            Student top = s.peek();
            System.out.println(top.name);
            System.out.println(top.rollno);
            System.out.println(top.marks);
        }
    }
}
