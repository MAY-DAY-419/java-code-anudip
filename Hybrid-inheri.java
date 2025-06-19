interface Exam {
    void giveExam();
}

interface Result {
    void showResult();
}

class Student {
    void studentInfo() {
        System.out.println("Name: Mayank Dantre");
        System.out.println("Roll No: 101");
    }
}

class ReportCard extends Student implements Exam, Result {
    public void giveExam() {
        System.out.println("Exam given for Math and Science.");
    }

    public void showResult() {
        System.out.println("Math: 85 marks");
        System.out.println("Science: 90 marks");
        System.out.println("Result: Passed with Distinction");
    }

    void extraActivity() {
        System.out.println("Participated in Science Quiz.");
    }
}

public class Main {
    public static void main(String[] args) {
        ReportCard student1 = new ReportCard();
        student1.studentInfo();
        student1.giveExam();
        student1.showResult();
        student1.extraActivity();
    }
}
