public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "AP Computer Science A";
    System.out.println("Course name: " + course);
    int avgTime = 150;
    System.out.println("Average time spent in a week for this course in minutes: " + avgTime);

    int homework1 = 94;
    int homework2 = 78;
    int homework3 = 22;
    int homework4 = 89;
    System.out.println("Homework grades for this course:");
    System.out.println(homework1);
    System.out.println(homework2);
    System.out.println(homework3);
    System.out.println(homework4);
    
    double quiz1 = 88.5;
    double quiz2 = 74.6;
    System.out.println("Quiz grades for this course:");
    System.out.println(quiz1);
    System.out.println(quiz2);
    double exam = 82.13;
    System.out.println("Final exam grade for this course:");
    System.out.println(exam);

    int hours = avgTime/60;
    int minutes = avgTime%60;
    System.out.println("Weekly time spent: " + hours + "hrs and " + minutes + "mins");

    double avgHW = (homework1 + homework2 + homework3 + homework4)/4;
    System.out.println("Average homework grade: " + avgHW);
    double avgQuiz = (quiz1 + quiz2)/2;
    System.out.println("Average quiz grade: " + avgQuiz);
    System.out.println("Final exam grade: " + exam);
    int overall = (int)(((avgHW * 0.35) + (avgQuiz * 0.15) + (exam * 0.5))+0.5);
    System.out.println("Overall grade: " + overall);
  }
}
