import java.util.Scanner;

public class FibonacciSayisi {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        //değişkenleri tanımlayıp n.sayıyı kullanıcıdan alma
        int s1=1, s2=1, n;
        System.out.print("Fibonacci Dizisi" +"\n \n" + "N Sayısı Giriniz: ");
        n = input.nextInt();
        
        //1.sayı sabit olduğu için istenirse direkt yazdırma
        if(n==1){
        System.out.println(n + ". Sayısı: " + "1");
        }
        
        //2.terim sabit olduğu için istenirse direkt yazdırma
        else if(n==2){
            System.out.println(n + ". Sayısı: " + "1");
        }
        
        //n'inci fibonacci sayısını hesaplama
        else{
            //n'inci sayıya kadar sayıları ekrana yazdırma
            System.out.print(s1 + " " + s2);
            
            for(int f=2; f<n; f++){
            int s3 = s1 + s2;
            System.out.print(" " + s3 + " ");
            
            //ilk değeri ikinicye ikinci değeri toplama eşitliyoruz
            s1 = s2; 
            s2 = s3; 
            }
            //n'inci sayıyı yazdırma
             System.out.println("\n" + n + ". Sayısı: " + s2);
        }
        
    }
    
}
