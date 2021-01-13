import java.util.Scanner;

public class KdvHesaplama {
    
    public static void main(String[] args){
    
        //değişken tanımlama
        double fiyat, kdvlifiyat, kdv=0.18;
        
        Scanner input = new Scanner(System.in);
        
        //kullanıcıdan fiyat isteme
        System.out.print("Lütfen Fiyat Giriniz: ");
        fiyat = input.nextDouble();
        
        //kdvli tutar hesaplama
        kdvlifiyat = fiyat + (kdv*fiyat);
        
        //ekrana tutarı yazdırma
        System.out.print("KDV Tutarı: " + kdv + " TL" + "\n");
        System.out.print("KDV'siz Tutar: " + fiyat + " TL" + "\n");
        System.out.print("KDV'li Tutar: " + kdvlifiyat + " TL" + "\n");
        
    }
}
