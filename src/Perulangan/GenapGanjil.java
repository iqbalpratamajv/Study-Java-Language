package Perulangan;

public class GenapGanjil {
  public static void main(String[] args) {

    for (int number = 1; number <= 10; number++) {
      printEvenOrOdd(number);
    }
  }

  private static void printEvenOrOdd(int number) {
    if (number % 2 == 0) {
      System.out.println(number + " Ini adalah genap");
    } else {
      System.out.println(number + " Ini adalah ganjil");
    }
  }
}
