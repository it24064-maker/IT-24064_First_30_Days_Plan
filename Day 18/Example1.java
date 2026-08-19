import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class CarDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Car Service Information");
        System.out.println("Service Date: " + date);
        System.out.println("Service Time: " + time);
        System.out.println("Full Date & Time: " + dateTime);
    }
}