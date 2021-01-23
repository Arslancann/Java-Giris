import java.util.Scanner;

public class MOlusturma {
    
    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Yükseklik Giriniz: ");
        int boy = input.nextInt();
        int en = boy*2 - 3; //en hesaplama
        int ikinciyildiz = en-1;
        
        if((boy>=3)&&(boy%2!=0)) //3 e eşit büyük ve tek mi kontrol etme
        {
            for(int satir=0; satir<boy; satir++) //satır döngüsü boy kadar çalıştır
            {
                for(int sutun=0; sutun<en; sutun++) //sütun döngüsünü en kadar çalıştır
                {
                    if((sutun==0) || (sutun==ikinciyildiz)) //sutun pozisyonu 0 ve en-1 eşitse yıldız koy
                    {
                        System.out.print("*");
                    }
                    else if((satir<boy-1) && ((satir==sutun) || (sutun==ikinciyildiz-satir))) //satır küçük boy-1 ve satır sütuna eşit veya sutun en-1-satır ise yıldız koy
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
            System.out.println("Hatalı Girdiniz!");
        }
        
    }
    
}
