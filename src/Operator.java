public class Operator {
    public static void main(String[] args){
        int angkaPertama, angkaKedua;
        angkaPertama = 20;
        angkaKedua = 5;

        int Penjumlahan, Pengurangan, Perkalian, Pembagian, Modulo;
        Penjumlahan = angkaPertama + angkaKedua;
        Pengurangan = angkaPertama - angkaKedua;
        Perkalian = angkaPertama * angkaKedua;
        Pembagian = angkaPertama / angkaKedua;
        Modulo = angkaPertama % angkaKedua;

        System.out.println("Hasil penjumlahan: "+ Penjumlahan);
        System.out.println("Hasil pengurangan: "+ Pengurangan);
        System.out.println("Hasil Perkalian: "+ Perkalian);
        System.out.println("Hasil Pembagian: "+ Pembagian);
        System.out.println("Hasil sisa bagi / modulo: "+ Modulo);
    }
}
