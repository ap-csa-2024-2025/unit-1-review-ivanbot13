public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "AP Computer Science A";
    System.out.println("course name: " + course);
    int avgTime = 150;
    int homework1 = 94;
    int homework2 = 78;
    int homework3 = 23;
    int homework4 = 89;
    double quiz1 = 88.24;
    double quiz2 = 74.63;
    double exam = 82.13;

    int hours = avgTime/60;
    int minutes = avgTime%60;
    System.out.println("Weekly time spent: " + hours + "hrs and " + minutes + "mins");


  }
}
