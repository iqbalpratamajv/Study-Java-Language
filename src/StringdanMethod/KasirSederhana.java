package StringdanMethod;

public class KasirSederhana {

    private static final double DISKON_MEMBER = 0.10;
    private static final int MINIMAL_PEMBELIAN = 100000;

    public static int hitungTotalPembelian(int hargaBarang, int banyakBarang) {
        return hargaBarang * banyakBarang;
    }

    public static double hitungDiskonBarang(int totalHargaBarang) {
        if (totalHargaBarang >= MINIMAL_PEMBELIAN) {
            return totalHargaBarang * DISKON_MEMBER;
        }
        return 0;
    }

    public static void CetakStruk(String namaBarang, int hargaBarang, double totalDiskonPembelian, int banyakBarang,
            int totalHargaBarang) {
        double totalBayar = totalHargaBarang - totalDiskonPembelian;
        System.out.println("== Nota Pembelian ==");
        System.out.println("Nama barang: " + namaBarang + " " + banyakBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Total Harga: " + totalHargaBarang);
        System.out.println("Diskon: " + totalDiskonPembelian);
        System.out.println("Harga Setelah diskon: " + totalBayar);
    }

    public static void main(String[] args) {
        String namaBarang = "Susu Kaleng";
        int hargaBarang = 100000;
        int banyakBarang = 3;

        int totalHargaBarang = hitungTotalPembelian(hargaBarang, banyakBarang);
        double totalDiskonPembelian = hitungDiskonBarang(totalHargaBarang);

        CetakStruk(namaBarang, hargaBarang, totalDiskonPembelian, banyakBarang, totalHargaBarang);
    }
}
