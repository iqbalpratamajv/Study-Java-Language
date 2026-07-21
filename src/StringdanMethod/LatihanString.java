package StringdanMethod;

public class LatihanString {
    public static void main(String[] args) {
        String nama = "Teknik Informatika";

        // Ini untuk menampilkan jumlah karakter
        System.out.println("Jumlah karakternya: " + nama.length());

        // Ini untuk memperbesar semua karakter
        System.out.println("Huruf besar: " + nama.toUpperCase());

        // Ini untuk memperkecil semua karakter
        System.out.println("Nama kecil: " + nama.toLowerCase());

        // Ini untuk menampilkan karakter yang ditentutkan
        System.out.println("Karakter pertama: " + nama.charAt(0));

        // Ini untuk menampilkan karakter yang kita tentukan dari urutan 0 - 5
        System.out.println("Karakter teknik: " + nama.substring(0, 5));

        // Ini untuk mengecek apakah di dalam kode ada sebuah kata yang dicari
        System.out.println("Mengandung info: " + nama.contains("Info"));
    }
}
