public class Operator {
    public static void main(String[] args){
        int angkaPertama, angkaKedua;
        angkaPertama = 20;
        angkaKedua = 5;

        int penjumlahan, pengurangan, perkalian, pembagian, modulo;
        penjumlahan = angkaPertama + angkaKedua;
        pengurangan = angkaPertama - angkaKedua;
        perkalian = angkaPertama * angkaKedua;
        pembagian = angkaPertama / angkaKedua;
        modulo = angkaPertama % angkaKedua;

        System.out.println("Hasil penjumlahan: "+ penjumlahan);
        System.out.println("Hasil pengurangan: "+ pengurangan);
        System.out.println("Hasil Perkalian: "+ perkalian);
        System.out.println("Hasil Pembagian: "+ pembagian);
        System.out.println("Hasil sisa bagi / modulo: "+ modulo);
    }
}
