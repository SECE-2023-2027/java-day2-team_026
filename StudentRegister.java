import java.util.*;

public class StudentRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        Vector<Vector<String>> students = new Vector<>();
        for (int i = 0; i < n; i++) {
            Vector<String> student = new Vector<>();
            System.out.println("Enter the name of student " + (i + 1) + ":");
            student.add(sc.next());
            student.add(sc.next());
            student.add(sc.next());y
            students.add(student);
        }
        int h=0,l=0,i=1000,j=-1000;
        for (Vector<String> student : students) {
            if(i>Integer.parseInt(student.get(2))) {
                i = Integer.parseInt(student.get(2));
                l = students.indexOf(student);
            }
            if(j<Integer.parseInt(student.get(2))) {
                j = Integer.parseInt(student.get(2));
                h = students.indexOf(student);
            }
        }
        System.out.println("Name and Id of higher and lower mark students:");
        System.out.println(students.get(l).get(0) + " " + students.get(l).get(1));
        System.out.println(students.get(h).get(0) + " " + students.get(h).get(1));
        sc.close();
    }
}
