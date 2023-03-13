public class Student {
     String name;
   double totalQuizScore;
   static int number;
//    public Student(String name) {
//        this.name = name;
//        this.totalQuizScore = 0;
//
//    }
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
        if (number == 0) {
            return 0;
        }
        double a =(double) totalQuizScore/number;
        return a;
    }
}
