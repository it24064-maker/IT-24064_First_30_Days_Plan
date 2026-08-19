import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<UniversityMember> members = new ArrayList<>();

        Professor professor1 =
                new Professor(
                        101,
                        "Dr. Ahmed",
                        90000,
                        "Computer Science",
                        "Artificial Intelligence",
                        45
                );

        AdministrativeOfficer officer1 =
                new AdministrativeOfficer(
                        201,
                        "Ms. Fatema",
                        50000,
                        "Student Affairs"
                );

        members.add(professor1);
        members.add(officer1);

        System.out.println("===== Dynamic Binding =====");

        for (UniversityMember member : members) {

            member.displayBasicInfo();
            member.performDuty();

            System.out.println();
        }

        System.out.println("===== Downcasting =====");

        for (UniversityMember member : members) {

            if (member instanceof Professor) {

                Professor p = (Professor) member;

                p.displayBasicInfo();
                p.showResearchProfile();

                System.out.println();
            }
        }
    }
}
