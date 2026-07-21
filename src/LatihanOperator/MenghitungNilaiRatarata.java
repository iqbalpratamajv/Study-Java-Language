package LatihanOperator;

public class MenghitungNilaiRatarata {
    public static void main(String[] args) {
        int nilaiMatematika, nilaiBahasaIndonesia, nilaiIPA;
        nilaiMatematika = 85;
        nilaiBahasaIndonesia = 90;
        nilaiIPA = 78;

        int totalNilaiSiswa = nilaiMatematika + nilaiBahasaIndonesia + nilaiIPA;
        int nilaiRataRata = (nilaiMatematika + nilaiBahasaIndonesia + nilaiIPA) / 3;

        System.out.println("Total nilai: " + totalNilaiSiswa);
        System.out.println("Nilai rata rata: " + nilaiRataRata);
    }
}
