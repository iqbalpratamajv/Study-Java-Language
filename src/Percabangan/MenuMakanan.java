package Percabangan;

import java.util.Scanner;

public class MenuMakanan {

    public static void menuMasakan() {
        System.out.println("== Menu ==");
        System.out.println("1. Bakso");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Nasi Goreng");
    }

    public static String logikaPilihMenu(String pilihMenu) {
        return switch (pilihMenu) {
            case "1" -> "Bakso";
            case "2" -> "Mie Ayam";
            case "3" -> "Nasi Goreng";
            default -> "Tidak ada pilihan";
        };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        menuMasakan();
        System.out.print("Pilih menu: ");
        String pilihMenu = input.next();

        String cetakNilai = logikaPilihMenu(pilihMenu);

        System.out.println(cetakNilai);

        input.close();
    }

}
