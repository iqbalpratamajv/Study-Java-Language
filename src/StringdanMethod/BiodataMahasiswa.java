package StringdanMethod;

import java.util.Scanner;

public class BiodataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("== Biodata Mahasiswa ==");
        System.out.println();

        System.out.print("Masukkan nama: ");
        String namaMahasiswa = input.nextLine();

        System.out.print("Masukkan NIM: ");
        int nimMahasiswa = input.nextInt();

        input.nextLine();

        System.out.print("Masukkan prodi: ");
        String prodiMahasiswa = input.nextLine();

        System.out.print("Masukkan nama Universitas: ");
        String namaUniversitas = input.nextLine();

        System.out.println();

        System.out.println("== Biodata Mahasiswa ==");
        System.out.println("Nama       : " + namaMahasiswa);
        System.out.println("NIM        : " + nimMahasiswa);
        System.out.println("Prodi      : " + prodiMahasiswa);
        System.out.println("Universitas: " + namaUniversitas);

        input.close();
    }
}
