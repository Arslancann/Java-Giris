import java.util.Scanner;

public class KareOlusturma {
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int kare = input.nextInt();
        int yildiz=kare-1;
        
        for(int satir=0; satir<kare; satir++)
        {
            for(int sutun=0; sutun<kare; sutun++)
            {
                if((satir==0)||(satir==yildiz))//full yıldız eklenecek satırları hesaplama
                {
                    System.out.print("*");
                }
                else if((sutun==0)||(sutun==yildiz))//yıldız olacak sütunları hesaplama
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
    
}
