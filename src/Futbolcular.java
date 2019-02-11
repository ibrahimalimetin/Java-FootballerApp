
import java.util.ArrayList;

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Futbolcular {
    
    private ArrayList<String> futbolcular = new ArrayList<String>();  
    
    public void futbolcularıGoster(){
        System.out.println("Futbolcu listesinde " + futbolcular.size() + " kadar futbolcu var!" );
        
        for (int i = 0 ; i < futbolcular.size() ; i++){
            System.out.println((i+1) + ". Futbolcu :" + futbolcular.get(i));
        }
    }
    
    public void futbolcuEkle(String kisi){
        futbolcular.add(kisi);
        
        System.out.println("Futbolcu kadrosu güncellendi!");
    }
    
    public void futbolcuGuncelle(String yeni_futbolcu , int pozisyon){
        
        futbolcular.set(pozisyon, yeni_futbolcu);
        
        System.out.println("Futbolcu kadrosu güncellendi!");
        
    }
    
    public void futbolcuCikart(int pozisyon){
        
        String kisi = futbolcular.get(pozisyon);
        futbolcular.remove(pozisyon);
        System.out.println(kisi + " isimli futbolcu kadrodan çıkartıldı!!!");
        
    }
    
    public void futbolcuAra(String futbolcuAd){
        
        int pozisyon = futbolcular.indexOf(futbolcuAd);
        
        if(pozisyon >= 0){
            System.out.println("Futbolcu kadroda bulundu!!!");
        }
        else{
            
            System.out.println("Futbolcu kadroda yok!");
        }
    }
}
