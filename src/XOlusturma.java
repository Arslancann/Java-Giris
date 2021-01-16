import java.util.Scanner;

public class XOlusturma {
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int sayi = input.nextInt();
        
        if(sayi %2!=0)//tek sayı kontrolü
        {
            for(int satir=0; satir<sayi; satir++)//satır sırası
            {               
                for(int sutun=0; sutun<sayi; sutun++)//sütun sırası
                {
                    int ikinciyildiz = sayi - (satir+1);//ikinci yıldızın yerini bulma
                    
                    if((satir==sutun) || (ikinciyildiz==sutun))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        else //tek olup olmadığını kontrol et, çift ise hata mesajı yazdır
        {
            System.out.println("\nHatalı Değer\nTekrar Deneyiniz!");
        }
        
    }
    
}
