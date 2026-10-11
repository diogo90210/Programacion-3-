package S_4_4;

public class Student {
    private String name;
    private double exam1; 
    private double exam2; 
    private double finalExam; 

    public Student(String name, double exam1, double exam2, double finalExam) {
        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.finalExam = finalExam;
    }

    public double getFinalGrade() {
        return (exam1 * 0.10) + (exam2 * 0.10) + (finalExam * 0.80);
    }

    public String getName() {
        return name;
    }

    public double getExam1() {
        return exam1;
    }

    public double getExam2() {
        return exam2;
    }

    public double getFinalExam() {
        return finalExam;
    }
}