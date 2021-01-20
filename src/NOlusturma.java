import java.util.Scanner;

public class NOlusturma {
    
    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Yükseklik Giriniz: ");
        int boy = input.nextInt();
        int ikinciyildiz=boy-1;
        
        if(boy>=3)
        {
            for(int satir=0; satir<boy; satir++)
            {
                for(int sutun=0; sutun<boy; sutun++)
                {
                    if((satir==sutun)||(sutun==ikinciyildiz))
                    {
                        System.out.print("*");                        
                    }
                    else if(sutun==0)
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
