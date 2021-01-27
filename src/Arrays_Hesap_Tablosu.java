public class Arrays_Hesap_Tablosu {
    
    public static int ortalama(int data[]) {
        
        int toplam=0;
        for(int ortalama : data)
        {
            toplam+=ortalama;
        }
        toplam = toplam / data.length;
        return toplam;
    }
    
    public static int ssapma(int data[]) {
        
        int ssapma=0;
        for(int sapma : data)
        {
            ssapma += Math.pow(sapma - ortalama(data),2);
        }
        ssapma =(int) Math.sqrt(ssapma / (data.length-1));
        return ssapma;
    }
    
    public static int min(int data[]) {
        
        int kucuksayi = data[0];
        for(int i=1; i<data.length; i++)
        {
            if(kucuksayi > data[i])
            {
                kucuksayi = data[i];
            }           
        }
        return kucuksayi;
    }
    
    public static int max(int data[]) {
        
        int buyuksayi = data[0];
        for(int i=1; i<data.length; i++)
        {
            if(buyuksayi < data[i])
            {
                buyuksayi = data[i];
            }           
        }
        return buyuksayi;
    }
    
    public static void main(String[]args) {
        
        int sayilar[] = {13, 35, 58, 29, 77};
        
        System.out.println("Ortalama: " + ortalama(sayilar));
        System.out.println("Standart Sapma: " + ssapma(sayilar));
        System.out.println("Min Değeri: " + min(sayilar));
        System.out.println("Max Değeri: " + max(sayilar));
        
    }
    
}
