import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String username, password, resetPassword, newPassword;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        username = input.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password = input.nextLine();

        // String'lerde eşitleme yapabilmek için .equals kullanıyoruz.
        if(username.equals("Patika") && password.equals("java123")) {
            System.out.println("Başarılı bir şekilde giriş yaptınız.");
        }
        else if(username.equals("Patika") &&! password.equals("java123")){
            System.out.println("Şifrenizi yanlış girdiniz. Şifrenizi sıfırlamak ister misiniz ? (Evet veya Hayır)");
            resetPassword = input.nextLine();

            if(resetPassword.equals("Evet")) {
                System.out.println("Yeni Şifrenizi Giriniz: ");
                newPassword = input.nextLine();
                if(newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else{
                    System.out.println("Şifre Oluşturuldu");
                }
            }
        }
        else{
            System.out.println("Yanlış Bilgi Girdiniz.");
        }

    }
}
