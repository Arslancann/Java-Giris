public class Arrays_Boolean_Kontrol {
    
    public static boolean toplamvarmi(int data[], int hedef) {
        
        int toplam = 0;
        for(int i=0; i<data.length; i++)
        {
            for(int j=0; j<data.length; j++)
            {
                if(i!=j)
                {
                    toplam = data[i] + data[j];
                    
                    if(toplam == hedef)
                    {
                        return true;
                    }
                }
            }
        }  
        return false;
        
    }
    
    public static void main(String[]args) {
            
        int numbers[] = {12, 34, 6, 3, 7, 2, 8, 9, 12, 43};
        
        System.out.println("Toplam Var Mı: " + toplamvarmi(numbers,13));
        
    }
    
}
