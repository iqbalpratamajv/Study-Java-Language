package Percabangan;

import java.util.Scanner;

public class MenentukanKelulusan {

    private static final int NILAI_MINIMUM_MAHASISWA = 75;

    public static String cekKondisi(int nilaiMahasiswa) {
        if (nilaiMahasiswa >= NILAI_MINIMUM_MAHASISWA) {
            return "Lulus";
        }
        return "Tidak Lulus";
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa: ");
        int nilaiMahasiswa = Input.nextInt();

        String statusNilai = cekKondisi(nilaiMahasiswa);

        System.out.println("Anda dinyatakan: " + statusNilai);

        Input.close();
    }
}
