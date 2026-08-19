class AdministrativeOfficer extends Employee {

    private String officeSection;

    public AdministrativeOfficer(int memberId,
                                 String name,
                                 double salary,
                                 String officeSection) {

        super(memberId, name, salary);
        this.officeSection = officeSection;
    }

    public void manageRecords() {
        System.out.println(name +
                " manages records in " +
                officeSection + ".");
    }

    @Override
    public void performDuty() {
        System.out.println(name +
                " handles administrative operations in " +
                officeSection + ".");
    }
}