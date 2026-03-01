import java.util.Scanner;
public class StudentDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Student13[] arrayOfStudent = new Student13[3];
        String dummy;

        for (int i=0; i<3; i++) {
        arrayOfStudent[i] = new Student13();
        System.out.println("Input Data for Student-"+(i+1));
        System.out.print("NIM           : ");
        arrayOfStudent[i].nim = sc.nextLine();
        System.out.print("NAME          : ");
        arrayOfStudent[i].name = sc.nextLine();
        System.out.print("CLASS         : ");
        arrayOfStudent[i].kelas = sc.nextLine();
        System.out.print("GPA           : ");
        dummy = sc.nextLine();
        arrayOfStudent[i].gpa = Float.parseFloat(dummy);
        System.out.println("-----------------------------------------------");
        }

        for (int i=0; i<3;i++) {
            System.out.println("Data for Student-"+(i+1)+": ");
            arrayOfStudent[i].printInfo();
        }
        sc.close();
    }
}
