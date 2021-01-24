import java.util.Scanner;

public class WOlusturma {
    
    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Yükseklik Giriniz: ");
        int boy = input.nextInt();
        int en = boy*4-3;
        int orta = en/2+1;
        
        if(boy>=3)
        {
            for(int satir=0; satir<boy; satir++) //boy kadar satır oluşturma
            {
                for(int sutun=0; sutun<en; sutun++) //en kadar sütun oluşturma
                {
                    if((satir==sutun)||(sutun==en-1-satir)) //en soldaki ve en sağdaki yıldızları yazdırma
                    {
                        System.out.print("*");
                    }
                    else if((sutun==orta-1-satir)||(sutun==orta-1+satir)) //ortadaki yıldızları yazdırma
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
            System.out.println("Hatalı Giriş!");
        }
        
    }
    
}
