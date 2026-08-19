class Professor extends AcademicStaff {

    protected String researchArea;
    protected int publications;

    public Professor(int memberId,
                     String name,
                     double salary,
                     String department,
                     String researchArea,
                     int publications) {

        super(memberId, name, salary, department);

        this.researchArea = researchArea;
        this.publications = publications;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public int getPublications() {
        return publications;
    }

    public void showResearchProfile() {
        System.out.println("Research Area: " + researchArea);
        System.out.println("Publications: " + publications);
    }

    @Override
    public void performDuty() {
        System.out.println(name +
                " is supervising research and teaching advanced courses.");
    }
}

