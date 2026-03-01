public class DatLecture13 {

    public void dataAllDosen(Lecture13[] arrayOfLecture) {
        System.out.println("\n=== ALL LECTURERS ===");
        for (Lecture13 l : arrayOfLecture) {
            String genderText;
            if (l.gender == true) {
                genderText = "Male";
            } else {
                genderText = "Female";
            }
            System.out.println(l.code + " | " + l.name + " | "  + genderText + " | " + l.age);
        }
    }

    public void numberOfLecturersPerGender(Lecture13[] arrayOfLecture) {
        int male = 0;
        int female = 0;

        for (Lecture13 l : arrayOfLecture) {
            if (l.gender == true) {
                male++;
            } else {
                female++;
            }
        }
        System.out.println("\nNumber of Male Lecturers   : " + male);
        System.out.println("Number of Female Lecturers : " + female);
    }

    public void averageAgeOfLecturersPerGender(Lecture13[] arrayOfLecture) {
        int male = 0;
        int female = 0;
        int totalMaleAge = 0;
        int totalFemaleAge = 0;

        for (Lecture13 l : arrayOfLecture) {
            if (l.gender == true) {
                male++;
                totalMaleAge += l.age;
            } else {
                female++;
                totalFemaleAge += l.age;
            }
        }

        if (male > 0) {
            System.out.println("\nAverage Male Age   : " + (totalMaleAge / male));
        }

        if (female > 0) {
            System.out.println("Average Female Age : " + (totalFemaleAge / female));
        }
    }

    public void infoOldest (Lecture13[] arrayOfLecture) {
        Lecture13 oldest = arrayOfLecture[0];

        for (Lecture13 l : arrayOfLecture) {
            if (l.age > oldest.age) {
                oldest = l;
            }
        }

        System.out.println("\nOldest Lecturer : " + oldest.name + " (" + oldest.age + ")");
    }

    public void infoYoungest(Lecture13[] arrayOfLecture) {
        Lecture13 youngest = arrayOfLecture[0];

        for (Lecture13 l : arrayOfLecture) {
            if (l.age < youngest.age) {
                youngest = l;
            }
        }

        System.out.println("Youngest Lecturer : " + youngest.name + " (" + youngest.age + ")");
    }
}
