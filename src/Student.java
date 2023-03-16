import java.util.Arrays;

public class Student {
    private String name[];
  private double totalQuizScore;
   private static int number;
    public Student(String name[]) {
        this.name = name;
        this.totalQuizScore = 0;

    }

    public void setTotalQuizScore(double totalQuizScore) {
        this.totalQuizScore = totalQuizScore;
    }

    public static void setNumber(int number) {
        Student.number = number;
    }

    public Student() {


    }
    public void setName(String name[]) {
        this.name = name;
    }

    public String[] getName() {
        return name;
    }

    public static int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + Arrays.toString(name) +
                ", totalQuizScore=" + totalQuizScore +
                '}';
    }

    public double getTotalQuizScore() {
        return totalQuizScore;
    }
    public void addQuiz(int score) {
        this.totalQuizScore +=  score;
        number++;
    }
    public double getAverageScore(){
        if (number == 0) {
            return 0;
        }
        double a =(double) totalQuizScore/number;
        return a;
    }
}
