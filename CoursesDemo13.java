import java.util.Scanner;

public class CoursesDemo13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of courses: ");
        int n = sc.nextInt();
        sc.nextLine();

        Courses13[] arrayOfCourses = new Courses13[n];
        String code, name, dummy;
        int creditHours, numOfHours;

        for (int i = 0; i < n; i++) {
            System.out.println("INPUT DATA FOR COURSE-" + (i + 1));
            System.out.print("CODE            : ");
            code = sc.nextLine();
            System.out.print("NAME            : ");
            name = sc.nextLine();
            System.out.print("CREDIT HOURS    : ");
            dummy = sc.nextLine();
            creditHours = Integer.parseInt(dummy);
            System.out.print("NUMBER OF HOURS : ");
            dummy = sc.nextLine();
            numOfHours = Integer.parseInt(dummy);
            arrayOfCourses[i] = new Courses13();  
            arrayOfCourses[i].addData(code, name, creditHours, numOfHours);
            System.out.println("--------------------------------------");
        }

        System.out.println("\n=== COURSE DATA ===");
        for (int i = 0; i < n; i++) {
            arrayOfCourses[i].printInfo();
        }
        sc.close();
    }
}
