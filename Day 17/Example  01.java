import java.io.File;
public class CarDirectory {
    public static void main(String[] args) 
    {
        File dir = new File("CarFolder");
        if (dir.mkdir()) {
            System.out.println("Car directory created successfully!");

        }
        else {
            System.out.println("CDirectory already exists.");

        }
        System.out.println("Directory Name: " + dir.getName());
        System.out.println("Directory Path:" + dir.getAbsolutePath());
        if(dir.exists()) 
        {
            System.out.println("Car directory exists.");

        }
    }
}