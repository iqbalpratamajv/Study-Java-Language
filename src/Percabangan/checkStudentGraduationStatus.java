package Percabangan;

import java.util.Scanner;

public class CheckStudentGraduationStatus {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nama siswa: ");
    String studentName = input.nextLine();

    System.out.print("Masukkan nilai siswa: ");
    int studentGrades = input.nextInt();

    String grade = gradePredicate(studentGrades);

    System.out.println(studentName + " Mendapatkan nilai " + grade);

    input.close();
  }

  private static String gradePredicate(int grades) {
    if (grades >= 90)
      return "A";
    if (grades >= 80)
      return "B";
    if (grades >= 70)
      return "C";
    return "D";
  }
}
