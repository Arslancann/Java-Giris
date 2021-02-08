public class KelimeSayma {
    
    public static int kelimesay(String[] kelimeler, String sayilacak) {
        
        int sayac = 0;
        for(int i=0; i<kelimeler.length; i++)
        {
            if(kelimeler[i].equals(sayilacak))
            {
                sayac++;
            }
        }
        return sayac;
        
    }
    
    public static void main(String[]args) {
        
        String[] kelimeler = {"arslan", "okan", "emel", "arslan", "cemal", "kamil"};
        for(int i=0; i<kelimeler.length; i++)
        {
            System.out.print(kelimeler[i] + " | ");
        }
        System.out.println();
        
        String kelime = "arslan";
        System.out.println("Bulunacak Kelime: " + kelime);
        System.out.println("Cevap: " + kelimesay(kelimeler,kelime));
               
    }
    
}
