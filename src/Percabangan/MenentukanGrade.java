package Percabangan;

import java.util.Scanner;

public class MenentukanGrade {

    private static final int MENDAPAT_NILAI_A = 90;
    private static final int MENDAPAT_NILAI_B = 85;
    private static final int MENDAPAT_NILAI_C = 70;

    public static String menentukanNilai(int nilaiMahasiswa) {
        if (nilaiMahasiswa >= MENDAPAT_NILAI_A) {
            return "A";
        }
        if (nilaiMahasiswa >= MENDAPAT_NILAI_B) {
            return "B";
        }
        if (nilaiMahasiswa >= MENDAPAT_NILAI_C) {
            return "C";
        }
        return "D";
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa: ");
        int nilaiMahasiswa = Input.nextInt();

        String cetakNilai = menentukanNilai(nilaiMahasiswa);
        System.out.println("Anda mendapatkan nilai " + cetakNilai);

        Input.close();

    }
}
