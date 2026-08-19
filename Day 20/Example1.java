import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CarTimeZone {
    public static void main(String[] args) {

        
        ZonedDateTime tokyoTime =
                ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime londonTime =
                ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println("Car Delivery Information");
        System.out.println("Tokyo Time: " + tokyoTime);
        System.out.println("London Time: " + londonTime);
    }
}