import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class StudentDateTime {
    public static void main(String[] args) {
        LocalDate examDate = LocalDate.now();
        LocalTime examTime = LocalTime.now();
        LocalDateTime fullInfo = LocalDateTime.now();

        System.out.println("Student Exam Information");
        System.out.println("Exam Date: " + examDate);
        System.out.println("Exam Time: " + examTime);
        System.out.println("Full Date & Time: " + fullInfo);
    }
}