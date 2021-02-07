public class ArraysElemanSirasiDegistirme2 {
    
     public static int[] karistirma2(int data[]) {
        
        int sonuc[] = new int[data.length];
        for (int i = 0; i<data.length/2; i++)
        {
            sonuc[i*2] = data[i];
            sonuc[i*2+1] = data[i+data.length/2];
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
        
        int[] sonucarray = karistirma2(data);
        for(int j=0; j<data.length; j++)
        {
            System.out.print(sonucarray[j] + " ");
        }
        System.out.println();
    }
    
}
