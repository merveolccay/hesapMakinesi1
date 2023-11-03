package java101;

import java.util.Scanner;

public class hesapMakinesi2 {

    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam: "+result);
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma: "+ result);
        return result;
    }
    static int times(int a, int b){
        int result = a * b;
        System.out.println("Çarpma: "+ result);
        return result;
    }
    static int divided(int a, int b){
        if(b == 0){
            System.out.println("ikinci sayı sıfırdan farklı olmalı");
            return 0;
        }
        int result = a / b;
        System.out.println("Çarpma: "+ result);
        return result;
    }
    static int power(int a, int b){
        int result=1;
        for(int i=1; i<=b ; i++){
            result *= a;
        }
        return result;
    }
    static int mod(int a, int b){
        return a%b ;
    }

    static void calc(int a, int b){
        System.out.println("Çevresi: "+ (2*(a+b)));
        System.out.println("Alanı: "+ (a*b));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n "
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

    while(true) {
        System.out.println(menu);
        System.out.print("Bir İşlem Seçiniz: ");
        select = scan.nextInt();
        if(select == 0){
            break;
        }
        System.out.print("İlk sayıyı giriniz: ");
        int a = scan.nextInt();
        System.out.print("İkinci sayı giriniz: ");
        int b = scan.nextInt();
        int result = 0;

        switch (select) {
            case 1:
                sum(a, b);
                break;
            case 2:
                minus(a,b);
                break;
            case 3:
                times(a,b);
                break;
            case 4:
                divided(a,b);
                break;
            case 5:
                System.out.println("üs hesabı:"+ power(a,b));
                break;
            case 6:
                System.out.println("mod işlemi:"+ mod(a,b));
                break;
            case 7:
                calc(a,b);
                break;
            default:
                System.out.println("Geçersiz işlem girdiniz.");
        }
    }
    System.out.println("Sistemden Çıkış Yapıldı!");
    }
}
