package LatihanOperator;

public class MenghitungGajiBersih {
    public static void main(String[] args) {
        int gajiPokok, bonus, potongan;
        gajiPokok = 5000000;
        bonus = 750000;
        potongan = 350000;

        int totalGajiSebelumPotongan = gajiPokok + bonus;
        int totalGajiSetelahPotongan = (gajiPokok + bonus) - potongan;

        System.out.println("Total gaji sebelum dipotong: Rp" + totalGajiSebelumPotongan);
        System.out.println("Total gaji setelah potong: Rp" + totalGajiSetelahPotongan);
    }
}
