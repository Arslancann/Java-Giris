import java.util.Scanner;

public class DikdortgenOlusturma {
    
    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Dikdörtgenin Eni: ");
        int en = input.nextInt();
        System.out.print("Dikdörtgenin Boyu: ");
        int boy = input.nextInt();
        int enyildiz = boy-1;
        int boyyildiz = en-1;
        
        for(int satir=0; satir<boy; satir++)
        {
            for(int sutun=0; sutun<en; sutun++)
            {
                if((satir==0)||(satir==enyildiz))//full yıldız olacak satırları hesaplama
                {
                    System.out.print("*");
                }
                else if((sutun==0)||(sutun==boyyildiz))//full yıldız olacak sütunları hesaplama
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
}
