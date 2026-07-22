package Percabangan;

import java.util.Scanner;

public class Login {

    private static final String USER_LOGIN = "admin";
    private static final String PASSWORD_ADMIN = "123";

    public static String loginUser(String userName, String password) {
        if (userName.equalsIgnoreCase(USER_LOGIN)) {
            if (password.equalsIgnoreCase(PASSWORD_ADMIN))
                return "Login berhasil";
        }
        return "Login gagal";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String userName = input.next();

        System.out.print("Masukkan password: ");
        String password = input.next();

        String cetakNilai = loginUser(userName, password);

        System.out.println(cetakNilai);
        input.close();
    }
}
