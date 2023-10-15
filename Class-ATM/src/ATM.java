
import java.util.Scanner;

public class ATM {

    

    public void ATM_calistir(Hesap hesap) {
        Scanner input = new Scanner(System.in);
        System.out.println("ATM ye hosgeldiniz");

        while (true) {
            islemler();
            System.out.print("islem seciniz: ");
            int islem = input.nextInt();
            if (islem == 0) {
                System.out.println("Cikis yapiliyor.");
                return;
            } else if (islem == 2) {
                System.out.print("Cekmek istediginiz miktari giriniz: ");
                int miktar1 = input.nextInt();
                hesap.para_cek(miktar1);
            } else if (islem == 3) {
                System.out.print("Yatirmak istediginiz miktari giriniz: ");
                int miktar2 = input.nextInt();
                hesap.para_yatir(miktar2);
            } else if (islem == 1) {
                System.out.println("Guncel bakiyeniz: " + hesap.getBakiye());
            }
        }
    }

    public void islemler() {

        System.out.println("1 -- bakiye goruntule");
        System.out.println("2 -- para cek");
        System.out.println("3 -- yatir cek");
        System.out.println("0 -- cikis yap");

    }
}
