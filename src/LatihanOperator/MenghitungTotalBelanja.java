package LatihanOperator;

public class MenghitungTotalBelanja {
    public static void main(String[] args){
        int hargaBuku, hargaPensil, hargaPenghapus;
        hargaBuku = 12500;
        hargaPensil = 3000;
        hargaPenghapus = 2500;

        System.out.println("Pelanggan Membeli:");
        System.out.println("- 4 Buku \n- 7 Pensil \n- 3 Penghapus");

        int jumlahBeliBuku = 4;
        int jumlahBeliPensil = 7;
        int jumlahBeliPenghapus = 4;

        int hitungHargaBuku = hargaBuku *  jumlahBeliBuku;
        int hitungHargaPensil = hargaPensil * jumlahBeliPensil;
        int hitungHargaPenghapus = hargaPenghapus * jumlahBeliPenghapus;

        System.out.println("Total yang harus di bayar: ");
        System.out.println("- Buku: Rp"+ hitungHargaBuku);
        System.out.println("- Pensil: Rp"+ hitungHargaPensil);
        System.out.println("- Penghapus: Rp"+ hitungHargaPenghapus);
    }
}
