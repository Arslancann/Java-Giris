import java.util.Scanner;

public class BasitHesapMakinesi {
    
    public static void main(String[]  args)
    {
        //istemci oluşturma
        Scanner scanner1 = new Scanner(System.in);
        
        //birinci sayıyı kullanıcıdan al
        System.out.print("1.sayıyı giriniz: ");
        int sayi1 = scanner1.nextInt();
        
        //ikinci sayıyı kullanıcıdan al
        System.out.print("2.sayıyı giriniz: ");
        int sayi2 = scanner1.nextInt();
        
        //işlem türünü kullanıcıdan al
        scanner1.nextLine();
        System.out.print("İşlem Türü(+ - * /): ");
        String tercih = scanner1.nextLine();
        
        
        if(tercih.equals("+")) //işlem türünü kontrol et
        {
            int toplam = sayi1 + sayi2; //sonucu hesapla
            System.out.println("Sonuç: " + toplam); //sonucu yazdır
}
        
        else if(tercih.equals("-")) //işlem türünü kontrol et
        {
            int cıkar = sayi1 - sayi2; //sonucu hesapla
            System.out.println("Sonuç: " + cıkar); //sonucu yazdır                  
        }
        
        else if(tercih.equals("*")) //işlem türünü kontrol et
        {
            int cıkar = sayi1 * sayi2; //sonucu hesapla
            System.out.println("Sonuç: " + cıkar); //sonucu yazdır
        }
        
        else if(tercih.equals("/")) //işlem türünü kontrol et
        {
            int bol = sayi1 / sayi2; //sonucu hesapla
            System.out.println("Sonuç: " + bol); //sonucu yazdır
        }
        
        //işlem türünü kontrol et, farklı ise hata mesajı yazdır
        else
        {
            System.out.println("Lütfen Seçim Yapınız!!!");
        }
            
    }
    
}
