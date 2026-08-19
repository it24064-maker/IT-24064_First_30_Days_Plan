import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StudentDateFormat {
    public static void main(String[] args) {

        
        LocalDateTime now = LocalDateTime.now();

        
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");

        
        String formattedDate = now.format(format);

        System.out.println("Student Admission Information");
        System.out.println("Formatted Date & Time: " + formattedDate);
    }
}