import java.util.Arrays;

public class ArraysMedian {
    
    public static int median(int data[]) {
        
        Arrays.sort(data);
        
        int ortaindeks, sayi1, sayi2;
        if(data.length %2 != 0)
        {
            ortaindeks = data.length / 2;
            return data[ortaindeks];
        }
        else
        {
            sayi1 = (data.length / 2);
            sayi2 = (data.length / 2 - 1);
        }
        return (data[sayi1] + data[sayi2]) / 2;
        
    }
    
    public static void main(String[]args) {
        
        int dizi[] = {13, 15, 12, 31, 24, 18};
        for(int i : dizi)
        {
            System.out.print(i + " ");
        }
        System.out.println("\nMedian: " + median(dizi));
        
    }
    
}
