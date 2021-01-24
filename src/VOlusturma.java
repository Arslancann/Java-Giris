import java.util.Scanner;

public class VOlusturma {
    
    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Yükseklik Giriniz: ");
        int boy = input.nextInt();
        int en = boy*2-1;
        
        if(boy>=3)
        {
            for(int satir=0; satir<boy; satir++) //boy kadar satır oluşturma
            {
                for(int sutun=0; sutun<en; sutun++) //en kadar sütun oluşturma
                {
                    if((satir==sutun) || (sutun==en-1-satir)) //yıldızları yazdırma
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
