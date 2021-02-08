public class TekrarEdenDegeriBulma {
    
    public static int tekrarlayan(int[] data) {
        
        int sayac = 0;
        
        for(int i=0; i<data.length; i++)
        {
            if(i+1 < data.length)
            {
                if(data[i] == data[i+1])
                {
                    sayac++;
                }
            }
        }
        return sayac;
        
    }
    
    public static void main(String[]args) {
        
        int[] data = {4, 6, 7, 2, 2, 4, 4, 6, 7, 7};
        for(int i=0; i<data.length; i++)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        
        System.out.println("Cevap: " + tekrarlayan(data));
        
    }
    
}
