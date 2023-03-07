public class Main {
    public static void main(String[] args) {
        Student a1 =new Student();
        Student a2 =new Student();
        a1.setName("zon");
        a1.addQuiz(5);
        a1.addQuiz(5);
        a1.addQuiz(5);
        System.out.println(a1.getAverageScore());
         System.out.println(a1.getTotalQuizScore());
    }


}