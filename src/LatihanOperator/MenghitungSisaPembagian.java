package LatihanOperator;

public class MenghitungSisaPembagian {
    public static void main(String[] args) {
        /*
         * Sebuah gudang memiliki 157 barang.
         * Setiap kardus dapat menampung 12 barang.
         * Hitung:
         * Berapa kardus penuh yang dibutuhkan?
         * Berapa sisa barang?
         * Operator:
         * - /
         * - %
         */

        int totalBarangdiGudang, kapasitasPerKardus;
        totalBarangdiGudang = 157;
        kapasitasPerKardus = 12;

        int totalKardusDibutuhkan = totalBarangdiGudang / kapasitasPerKardus;
        int sisaBarangDiluarKardus = totalBarangdiGudang % kapasitasPerKardus;

        System.out.println("Total kardus yang dibutuhkan: " + totalKardusDibutuhkan);
        System.out.println("Sisa barang diluar kardus: " + sisaBarangDiluarKardus);
    }
}
