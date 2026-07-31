package Perulangan;

import java.util.Scanner;

public class CheckingTheNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numerical = enterANumber(input);

    System.out.println(checkOddEven(numerical));
  }

  private static int enterANumber(Scanner input) {
    System.out.print("Masukkan angka: ");
    return input.nextInt();
  }

  private static String checkOddEven(int number) {
    return (number % 2 == 0) ? "Genap" : "Ganjil";
  }
}
