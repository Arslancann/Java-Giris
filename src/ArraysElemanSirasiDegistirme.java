
import java.util.Arrays;

public class ArraysElemanSirasiDegistirme {
    
    public static int[] karistirma(int data[]) {
        
        int[] sonuc = new int[data.length];
        int kisim1=0;
        int kisim2=data.length/2;
        int indeks=0;
        for(int i=0; i<data.length/2; i++)
        {
            sonuc[indeks] = data[kisim1];
            indeks++;
            kisim1++;
            sonuc[indeks] = data[kisim2];
            indeks++;
            kisim2++;
        }
        return sonuc;
    }
    
    public static void main(String[]args) {
        
        int data[] = {2, 4, 6, 8, 3, 5, 7, 9};
        for(int i=0; i<data.length; i++)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n-----------------");
        
        int[] sonucarray = karistirma(data);
        for(int j=0; j<data.length; j++)
        {
            System.out.print(sonucarray[j] + " ");
        }
        System.out.println();
    }
    
}
