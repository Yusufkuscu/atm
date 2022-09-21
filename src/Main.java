import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String usurname, password;
        String ad = "Yusuf", parola = "Kuscu123";
        int hak = 3;
        int bakiye = 2000;
        int secim;

        while (hak > 0) {
            System.out.print("Kullanıcı Adınız : ");
            usurname = scan.nextLine();
            System.out.print("Parolanız : ");
            password = scan.nextLine();

            if (usurname.equals(ad) && password.equals(parola)) {
                System.out.println("Merhaba KUŞÇU BANK'a Hoşgeldiniz...");
                do {
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Görüntüle\n" +
                            "4- Çıkış");
                    System.out.print("Lütfen İşlem Seçiniz : ");
                    secim = scan.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Miktar Giriniz: ");
                            int miktar = scan.nextInt();
                            bakiye += miktar;
                            break;
                        case 2:
                            System.out.print("Miktar Giriniz: ");
                            miktar = scan.nextInt();
                            if (miktar > bakiye){
                                System.out.println("Bakiye Yetersiz");
                            }else {
                            bakiye -= miktar;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye + " tl");
                            break;
                    }
                }while (secim !=4);
                System.out.println("Tekrar Görüşmek Üzere Sistemden Çıkıldı");
                break;
            }else {
                hak--;
                System.out.println("Hatalı Giriş Yaptınız");
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + hak);
                }
            }

        }

    }
}
