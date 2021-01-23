import java.util.Scanner;

public class ZOlusturma {
    
    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Yükseklik Giriniz: ");
        int boy = input.nextInt();
        
        if(boy>=3) //doğru değer girilip girilmediğini kontrol etme
        {
            for(int satir=0; satir<boy; satir++) //satır döngüsünü boy kadar çalıştır
            {
                for(int sutun=0; sutun<boy; sutun++) //sütun döngüsünü boy kadar  çalıştır
                {
                    if((satir==0)||(satir==boy-1))
                    {
                        System.out.print("*");
                    }
                    else if(sutun==boy-1-satir)
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
