package LatihanOperator;

public class MenghitungKonsumsiBBM {
    public static void main(String[] args) {
        int jarakTempuhMobil, konsumsiBBMMobil, hargaBensin;
        jarakTempuhMobil = 420;
        konsumsiBBMMobil = 14;
        hargaBensin = 13000;

        int totalBBMYangDibutuhkan = jarakTempuhMobil / konsumsiBBMMobil;
        int totalBiayaBBM = hargaBensin * totalBBMYangDibutuhkan;

        System.out.println("Bensin yang dibutuhkan: " + totalBBMYangDibutuhkan + "liter");
        System.out.println("Total biaya BBM: Rp" + totalBiayaBBM);
    }
}
