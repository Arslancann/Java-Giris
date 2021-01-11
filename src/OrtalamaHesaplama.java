import java.util.Scanner;

public class OrtalamaHesaplama {

    public static void main(String[] args) {
        
        System.out.println("HOŞGELDİNİZ");
        
        Scanner scanner = new Scanner (System.in);
        
        //kullanıcıdan isim al
        System.out.print("Adınız: ");
        String ad=scanner.nextLine();
        
        //kullanıcıdan 1.notu al
        System.out.print("1.Sınav: ");
        int kod=scanner.nextInt();
        
        //kullanıcıdan 2.notu al
        System.out.print("2.Sınav: ");
        int kod2=scanner.nextInt();
        
        //kullanıcıdan 3.notu al
        System.out.print("3.Sınav: ");
        int kod3=scanner.nextInt();
        
        //kullanıcının adını yazdır
        //kullanıcının notunu hesapla ve yazdır
        System.out.println(ad);
        System.out.println("Not Ortalamanız: " + (kod + kod2 + kod3) / 3);
            
    }
    
}
