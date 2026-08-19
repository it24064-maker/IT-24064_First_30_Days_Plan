import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CarDateParsing {
    public static void main(String[] args) {
        String carDate = "15-05-2026";
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(carDate, format);

        System.out.println("Car Manufacturing Date");
        System.out.println("Parsed Date: " + date);
    }
}