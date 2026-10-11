package S_4_4;

import java.util.Scanner;

public class Course {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce the number of students by course: ");
        int numStudents = scanner.nextInt();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            scanner.nextLine(); 
            
            System.out.print("Student name: ");
            String name = scanner.nextLine();

            System.out.print("Exam 1 (10%): ");
            double e1 = scanner.nextDouble();

            System.out.print("Exam 2 (10%): ");
            double e2 = scanner.nextDouble();

            System.out.print("Final exam (80%): ");
            double ef = scanner.nextDouble();

            students[i] = new Student(name, e1, e2, ef);
        }

        double sumE1 = 0;
        double sumE2 = 0;
        double sumEF = 0;
        double sumFinalGrade = 0;


        System.out.println("\n--------------------------------------------------------");
        System.out.printf("| %-15s | %-8s | %-8s | %-8s | %-8s |\n", "Student", "Exam 1", "Exam 2", "Final Exam", "Final Grade");
        System.out.println("--------------------------------------------------------");

        for (Student s : students) {
            double finalGrade = s.getFinalGrade();

            sumE1 += s.getExam1();
            sumE2 += s.getExam2();
            sumEF += s.getFinalExam();
            sumFinalGrade += finalGrade;

            System.out.printf("| %-15s | %-8.2f | %-8.2f | %-8.2f | %-8.2f |\n",
                    s.getName(), s.getExam1(), s.getExam2(), s.getFinalExam(), finalGrade);
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("| %-15s | %-8.2f | %-8.2f | %-8.2f | %-8.2f |\n",
                "MEDIA",
                (sumE1 / numStudents),
                (sumE2 / numStudents),
                (sumEF / numStudents),
                (sumFinalGrade / numStudents));
        System.out.println("--------------------------------------------------------");

        scanner.close();
    }
}