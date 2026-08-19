import java.io.File;
public class StudentDirectory {
    public static void main(String[] args) {
        File dir = new File("StudentFolder");
        if (dir.mkdir()) 
        {
            System.out.println("Student directory created successfully!");

        }
        else {
            System.out.println("Directory already exists.");

        }
        System.out.println("Directory Name:" + dir.getName());
        System.out.println("Directory path:" + dir.getAbsolutePath());
        if (dir.exists())
        {
            System.out.println("Student directory exists.");
            
        }
    }
}