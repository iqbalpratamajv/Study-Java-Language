package Percabangan;

import java.util.Scanner;

public class checkStudentGraduationStatus {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nama siswa: ");
    String studentName = input.nextLine();

    System.out.print("Masukkan nilai siswa: ");
    int studentGrades = input.nextInt();

    if (studentGrades >= 90) {
      System.out.println(studentName + " Mendapat nilai A");
    } else if (studentGrades >= 80) {
      System.out.println(studentName + " Mendapat nilai B");
    } else if (studentGrades >= 70) {
      System.out.println(studentName + " MEndapat nilai C");
    } else {
      System.out.println(studentName + " Mendapat nilai D");
    }
    input.close();
  }
}
