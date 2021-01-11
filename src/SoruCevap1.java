package ortalamahesaplama;

import java.util.Scanner;

public class SoruCevap1 {
    
    public static void main(String[]  args)
    {
        
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        int sayi1 = scanner1.nextInt();
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("2.sayıyı giriniz: ");
        int sayi2 = scanner2.nextInt();
        
        Scanner islem = new Scanner(System.in);
        System.out.print("İşlem Türü(+ - * /): ");
        String tercih = islem.nextLine();
        
        if(tercih.equals("+"))
        {
            int toplam = sayi1 + sayi2;
            System.out.println("Sonuç: " + toplam);
        }
        
        else if(tercih.equals("-"))
        {
            int cıkar = sayi1 - sayi2;
            System.out.println("Sonuç: " + cıkar);
                              
        }
        else if(tercih.equals("*"))
        {
            int cıkar = sayi1 * sayi2;
            System.out.println("Sonuç: " + cıkar);
        }
        
        else if(tercih.equals("/"))
        {
            int bol = sayi1 / sayi2;
            System.out.println("Sonuç: " + bol);
        }
        
        else
        {
            System.out.println("Lütfen Seçim Yapınız!!!");
        }
            
    }
    
}
