import java.util.Scanner;

public class StudentMain {
    public static void showInfo(Student st){
        System.out.println("Name :" + st.getName());
        System.out.println("Year :" + st.getStudent_year());
        System.out.println("Score :" + st.getScore());
        System.out.println("Grand :" + st.getGrade());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name: ");
        student.setName(scanner.next());
        System.out.print("Enter student year: ");
        student.setStudent_year(scanner.nextInt());
        System.out.print("Enter mid-term score: ");
        student.addPoint(scanner.nextInt());
        System.out.print("Enter final score: ");
        student.addPoint(scanner.nextInt());

        System.out.println();
        showInfo(student);
    }
}
