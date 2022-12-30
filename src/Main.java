import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int sayi1,sayi2,secim;
        System.out.print("Lütfen Birinci Sayıyı Giriniz: ");
        sayi1=input.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        sayi2=input.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("Birinci Sayı: "+sayi1+"\nİkinci Sayı: "+sayi2);
        System.out.println("------------------------------------------");

        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.println("!Lütfen Yapılacak İşlemi Seçiniz!");
        secim=input.nextInt();
        System.out.println("Seçiminiz: "+ secim);

        switch (secim) {
            case 1 -> System.out.println("Sayıların Toplamı= " + (sayi1 + sayi2));
            case 2 -> System.out.println("Sayıların Farkı= " + (sayi1 - sayi2));
            case 3 -> System.out.println("Sayıların Çarpımı= " + (sayi1 * sayi2));
            case 4 -> {
                if (sayi2 == 0) {
                    System.out.print("!!Sayı Sıfıra Bölünemez!!");
                } else
                    System.out.println("Sayıların Bölümü= " + (sayi1 / sayi2));
            }
            default ->System.out.println("!!Geçersiz İşlem!!");


        }

    }
}