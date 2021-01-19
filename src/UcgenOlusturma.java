import java.util.Scanner;

public class UcgenOlusturma {
    
    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin Yüksekliği: ");
        int yukseklik = input.nextInt();
        int ikinciyildiz=yukseklik*2-1;
        
        if(yukseklik %2 != 0)
        {
            for(int satir=0; satir<yukseklik; satir++)//satır sayısını hesaplama
            {
                for(int sutun=0; sutun<yukseklik*2-1; sutun++)//sütun sayısını hesaplama
                {
                    if((sutun==ikinciyildiz/2-satir)||(sutun==ikinciyildiz/2+satir))
                    {
                        System.out.print("*");
                    }
                    else if((satir==yukseklik-1)||(sutun==ikinciyildiz))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("\nTek Sayı Giriniz!");
        }

    }
    
}
