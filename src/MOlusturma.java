import java.util.Scanner;

public class MOlusturma {
    
    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Yükseklik Giriniz: ");
        int boy = input.nextInt();
        int en = boy*2 - 3;
        int ikinciyildiz = en-1;
        
        if((boy>=3)&&(boy%2!=0))
        {
            for(int satir=0; satir<boy; satir++)
            {
                for(int sutun=0; sutun<en; sutun++)
                {
                    if((sutun==0) || (sutun==ikinciyildiz))
                    {
                        System.out.print("*");
                    }
                    else if((satir<boy-1) && ((satir==sutun) || (sutun==ikinciyildiz-satir))) 
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
