import java.time.ZoneId;
import java.time.ZonedDateTime;

public class StudentTimeZone {
    public static void main(String[] args) {
        ZonedDateTime bdTime =
                ZonedDateTime.now(ZoneId.of("Asia/Dhaka"));
        ZonedDateTime nyTime =
                ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("Student Exam Schedule");
        System.out.println("Bangladesh Time: " + bdTime);
        System.out.println("New York Time: " + nyTime);
    }
}