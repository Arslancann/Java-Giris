import java.util.Scanner;

public class PiramitOlusturma {
    
    public static void main(String[] args){
        
        Scanner scannertek = new Scanner(System.in);
        
        //kullanıcıdan sayıyı al
        System.out.print("Tek Sayı Giriniz: ");
        int tsayi = scannertek.nextInt();
        
        
        //girilen sayının tek olup olmadığını kontrol et
        if(tsayi %2!=0)
        {
            //tek sayılarla piramit satırlarını oluştur
            for(int i=1; i<=tsayi; i+=2)
            {
                //piramit satırı kadar * ekle
                for(int j=1; j<=i; j++)
                {
                    System.out.print("*"); //ekrana yazdır
                }
                
                System.out.println(); //alt satıra yazdır
            }
        }
        
        else //tek olup olmadığını kontrol et, çift ise hata mesajı yazdır
        {
            System.out.println("Hatalı Bir Değer Girdiniz!");
        }
        
    }
    
}
