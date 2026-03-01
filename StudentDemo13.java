public class StudentDemo13 {
    public static void main(String[] args) {
        Student13[] arrayOfStudent = new Student13[3];
        arrayOfStudent[0] = new Student13();
        arrayOfStudent[0].nim = "244107060033";
        arrayOfStudent[0].name = "AGNES TITANIA KINANTI";
        arrayOfStudent[0].kelas = "SIB 1E";
        arrayOfStudent[0].gpa = (float) 3.75;

        arrayOfStudent[1] = new Student13();
        arrayOfStudent[1].nim = "2341720172";
        arrayOfStudent[1].name = "ACHMAD MAULANA HAMZAH";
        arrayOfStudent[1].kelas = "TI 2A";
        arrayOfStudent[1].gpa = (float) 3.36;

        arrayOfStudent[2] = new Student13();
        arrayOfStudent[2].nim = "244107023006";
        arrayOfStudent[2].name = "DIRHAMAWAN PUTRANTO";
        arrayOfStudent[2].kelas = "TI 2E";
        arrayOfStudent[2].gpa = (float) 3.80;

        System.out.println("NIM           : "+ arrayOfStudent[0].nim);
        System.out.println("NAME          : "+ arrayOfStudent[0].name);
        System.out.println("CLASS         : "+ arrayOfStudent[0].kelas);
        System.out.println("GPA           : "+ arrayOfStudent[0].gpa);
        System.out.println("-----------------------------------------------");
        System.out.println("NIM           : "+ arrayOfStudent[1].nim);
        System.out.println("NAME          : "+ arrayOfStudent[1].name);
        System.out.println("CLASS         : "+ arrayOfStudent[1].kelas);
        System.out.println("GPA           : "+ arrayOfStudent[1].gpa);
        System.out.println("-----------------------------------------------");
        System.out.println("NIM           : "+ arrayOfStudent[2].nim);
        System.out.println("NAME          : "+ arrayOfStudent[2].name);
        System.out.println("CLASS         : "+ arrayOfStudent[2].kelas);
        System.out.println("GPA           : "+ arrayOfStudent[2].gpa);
        System.out.println("-----------------------------------------------");
    }
}
