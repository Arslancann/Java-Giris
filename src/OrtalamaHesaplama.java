package ortalamahesaplama;

import java.util.Scanner;

public class OrtalamaHesaplama {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("HOŞGELDİNİZ");
        
        Scanner scannerad = new Scanner (System.in);
        System.out.print("Adınız: ");
        String ad=scannerad.nextLine();
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("1.Sınav: ");
        int kod=scanner.nextInt();
        
        Scanner scanner2 = new Scanner (System.in);
        System.out.print("2.Sınav: ");
        int kod2=scanner2.nextInt();
        
        Scanner scanner3 = new Scanner (System.in);
        System.out.print("3.Sınav: ");
        int kod3=scanner3.nextInt();
        
        System.out.println(ad);
        System.out.println("Not Ortalamanız: " + (kod + kod2 + kod3) / 3);
            
    }
    
}
