package Perulangan;

public class CalculatingTheDiscountedPrice {
  public static void main(String[] args) {
    double[] priceList = { 50000.0, 100000.0, 25000.0 };
    double totalSpending = calculateTotalSpending(priceList);
    System.out.println("Total Belanja: " + totalSpending);
  }

  public static double calculateTotalSpending(double[] itemPrice) {
    double total = 0.0;
    for (double price : itemPrice) {
      total += calculateThePriceAfterTheDiscount(price);
    }
    return total;
  }

  public static double calculateThePriceAfterTheDiscount(double originalPrice) {
    double discount = 0.10;
    if (originalPrice > 75000.0) {
      return originalPrice - (originalPrice * discount);
    }
    return originalPrice;
  }
}
