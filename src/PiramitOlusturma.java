import java.util.Scanner;

public class PiramitOlusturma {
    
    //temiz kod olması için method oluşturma
    static void karakteryaz(int karaktersayisi, String karakter){
        
        for(int k=0; k<karaktersayisi; k++){
            
            System.out.print(karakter);
            
        }
    }
    
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
                //boşluk sayısını hesapla
                int bosluksay = (tsayi - i) / 2;
                
                //sola boşluk yazdırma
                karakteryaz(bosluksay, " ");
                
                //yıldız yazdırma
                karakteryaz(i, "*");
                
                //sağa boşluk yazdırma
                karakteryaz(bosluksay, " ");
                
                System.out.println(); 
                
            }
        }
        
        else //tek olup olmadığını kontrol et, çift ise hata mesajı yazdır
        {
            System.out.println("Hatalı Bir Değer Girdiniz!");
        }
        
    }
    
}
