package student_report_card;

import java.util.Scanner;

public class StudentReportCard {
  public static void main(String[] args){

    // STUDENT REPORT CARD
    // Input student name and 3 - 5 subject scores
    // Use printf to format a clean table showing, subjects, scores, average, grade

    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter subject1: ");
      String subject1 = scanner.next();
      System.out.print("Enter subjectScore1: ");
      double subjectScore1 = scanner.nextDouble();

      System.out.println();

      System.out.print("Enter subject2: ");
      String subject2 = scanner.next();
      System.out.print("Enter subjectScore2: ");
      double subjectScore2 = scanner.nextDouble();

      System.out.println();

      System.out.print("Enter subject3: ");
      String subject3 = scanner.next();
      System.out.print("Enter subjectScore3: ");
      double subjectScore3 = scanner.nextDouble();

      System.out.println();

      double average = (subjectScore1 + subjectScore2 + subjectScore3) / 3;
      char grade = 0;

      System.out.printf("Subject: %.20s, Score: %.2f\n", subject1, subjectScore1);
      System.out.printf("Subject: %.20s, Score: %.2f\n", subject2, subjectScore2);
      System.out.printf("Subject: %.20s, Score: %.2f\n", subject3, subjectScore3);

      if (average < 0 || average > 100) {
        System.out.println("Average cant be less than zero or greater than 100");
      } else if (average >= 70) {
        grade = 'A';
      } else if (average >= 60) {
        grade = 'B';
      } else if (average >= 30) {
        grade = 'C';
      } else {
        grade = 'D';
      }

      System.out.println();

      System.out.printf("Your average is %.2f \n", average);
      System.out.println("Your grade is " + grade);
    }
    catch (Exception e){
      System.out.println("Invalid mismatch input");
    }
    scanner.close();
  }
}