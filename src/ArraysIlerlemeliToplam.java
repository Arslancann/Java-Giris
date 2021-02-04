public class ArraysIlerlemeliToplam {
    
    static void ilerlemelitoplam(int data[]) {
        
        int toplam = 0;
        for(int i=0; i<data.length; i++)
        {
            toplam += data[i];
            data[i] = toplam;
        }
        
    }
    
    public static void main(String[]args) {
        
        int data[] = {3, 4, 2, 5, 1, 2, 4, 7};
        for(int i=0; i<data.length; i++)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n--------------------");
        
        ilerlemelitoplam(data);
        for(int i=0; i<data.length; i++)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        
    }
    
}
