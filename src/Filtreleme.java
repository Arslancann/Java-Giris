public class Filtreleme {
    
    public static int[] filtre(int[] data, int sayi) {
        
        int[] sonuc = new int[data.length];
        int s1 = sayi;
        int indeks =0;
        for(int i=0; i<data.length; i++)
        {
            if(data[i] < s1)
            {
                sonuc[indeks] = data[i];
                indeks++;
            }
        }
        return sonuc;

    }
    
    public static void main(String[] args) {
        
        int[] data = {34, 88, 12, 33, 25, 16, 17, 18, 99, 65, 20};
        int sayi=35;
        for(int i=0; i<data.length; i++)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n--------------------------------");
        
        int[] sonucarray = filtre(data, sayi);
        for(int j=0; j<data.length; j++)
        {
            if(sonucarray[j] != 0)
            {
                System.out.print(sonucarray[j] + " ");
            }
        }
        System.out.println();
    }
    
}
