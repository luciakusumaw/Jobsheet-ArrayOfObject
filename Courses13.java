public class Courses13 {
    public String code;
    public String name;
    public int creditHours;
    public int numOfHours;
    public Courses13() {
    }

    public Courses13(String code, String name, int creditHours, int numOfHours) {
        this.code = code;
        this.name = name;
        this.creditHours = creditHours;
        this.numOfHours = numOfHours;
    }

    public void addData(String code, String name, int creditHours, int numOfHours) {
        this.code = code;
        this.name = name;
        this.creditHours = creditHours;
        this.numOfHours = numOfHours;
    }

    public void printInfo() {
        System.out.println("CODE            : " + code);
        System.out.println("NAME            : " + name);
        System.out.println("CREDIT HOURS    : " + creditHours);
        System.out.println("NUMBER OF HOURS : " + numOfHours);
        System.out.println("--------------------------------------");
    }
}
