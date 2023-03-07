public class Student {
     String name;
   double totalQuizScore;
   static int number;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getTotalQuizScore() {
        return totalQuizScore;
    }
    public void addQuiz(int score) {
        this.totalQuizScore +=  score;
        number++;
    }
    public double getAverageScore(){
        double a =totalQuizScore/number;
        return a;
    }
}
