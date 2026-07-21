package LatihanOperator;

public class MenghitungLuasdanKeliling {
    public static void main(String[] args) {

        int panjangPersegiPanjang = 15;
        int lebarPersegiPanjang = 8;

        int totalLuas = panjangPersegiPanjang * lebarPersegiPanjang;
        int totalKeliling = 2 * (panjangPersegiPanjang + lebarPersegiPanjang);

        System.out.println("Total Luas: " + totalLuas);
        System.out.println("Total Keliling: " + totalKeliling);
    }
}
