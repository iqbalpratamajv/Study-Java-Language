package Percabangan;

import java.util.Scanner;

public class MenentukanBilangan {
    
    private static final int BILANGAN_POSITIF = 0;

    public static String pengecekanBilangan(int nilai){
        if(nilai > BILANGAN_POSITIF){
            return "bilangan positif";
        }
        if (nilai < BILANGAN_POSITIF) {
            return "bilangan negatif";
        }
        return "bilangan 0";
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int nilai = Input.nextInt();

        String cetakNilai = pengecekanBilangan(nilai);

        System.out.println("Nilai anda termasuk "+ cetakNilai);

        Input.close();
        
    }
}
