package LatihanOperator;

public class KasirMini {
    public static void main(String[] args){
        int hargaMieInstan, hargaAirMineral, hargaRoti,
        diskonPembelian, uangPelanggan, totalMieDibeli,
        totalAirDibeli, totalRotiDibeli, totalBelanja,
        totalSetelahDiskon, uangKembalian;

        //Harga barang per buah
        hargaMieInstan = 3500;
        hargaAirMineral = 4000;
        hargaRoti = 7500;

        diskonPembelian = 5000;
        uangPelanggan = 60000;

        //Jumlah beli pelanggan
        totalMieDibeli = hargaMieInstan * 2;
        totalAirDibeli = hargaAirMineral * 5;
        totalRotiDibeli = hargaRoti * 3;
        totalBelanja = totalMieDibeli + totalAirDibeli + totalRotiDibeli;
        totalSetelahDiskon = totalBelanja - diskonPembelian;
        uangKembalian = uangPelanggan - totalSetelahDiskon;

        System.out.println("Total harga mie: Rp"+ totalMieDibeli);
        System.out.println("Total harga air: Rp"+ totalAirDibeli);
        System.out.println("Total harga roti: Rp"+ totalRotiDibeli);
        System.out.println("Total belanja: Rp"+ totalBelanja);
        System.out.println("Total setelah diskon: Rp"+ totalSetelahDiskon);
        System.out.println("Total uang kembalian: Rp"+ uangKembalian);
        
    }
}
