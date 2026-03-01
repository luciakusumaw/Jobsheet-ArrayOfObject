import java.util.Scanner;

public class LectureDemo13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of lecturers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Lecture13[] arrayOfLecture = new Lecture13[n];

        for (int i = 0; i < n; i++) {
            System.out.println("INPUT DATA FOR LECTURER-" + (i + 1));
            System.out.print("Code   : ");
            String code = sc.nextLine();
            System.out.print("Name   : ");
            String name = sc.nextLine();
            System.out.print("Gender (true=Male / false=Female): ");
            Boolean gender = sc.nextBoolean();
            System.out.print("Age    : ");
            int age = sc.nextInt();
            sc.nextLine();
            arrayOfLecture[i] = new Lecture13(code, name, gender, age);
            System.out.println("------------------------------------");
        }

        DatLecture13 data = new DatLecture13();
        data.dataAllDosen(arrayOfLecture);
        data.numberOfLecturersPerGender(arrayOfLecture);
        data.averageAgeOfLecturersPerGender(arrayOfLecture);
        data.infoOldest(arrayOfLecture);
        data.infoYoungest(arrayOfLecture);
        sc.close();
    }
}


