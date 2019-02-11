
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Main {
    
    private static Futbolcular futbolcular = new Futbolcular();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void goster(){
        
        futbolcular.futbolcularıGoster();
    }
    public static void futbolcu_ekle(){
        
        System.out.println("Eklemek istediğiniz futbolcunun adının giriniz");
        String ad = scanner.nextLine();
        
        futbolcular.futbolcuEkle(ad);
    }
    public static void futbolcu_guncelle(){
        
        System.out.println("Güncellemek istediğiniz pozisyon");
        int pozisyon = scanner.nextInt();
        scanner.nextLine(); //Enterı input olarak algılamaması gerekiyor
        String yeniFutbolcu = scanner.nextLine();
        
        futbolcular.futbolcuGuncelle(yeniFutbolcu, pozisyon-1);
    }
    
    public static void sil(){
        System.out.println("Kadrodan çıkartmak istediğiniz pozisyon(1,2,3.....)");
        
        int pozisyon = scanner.nextInt();
        futbolcular.futbolcuCikart(pozisyon-1);
    }
    public static void ara(){
        System.out.println("Bulmak istediğiniz futbolcunun adını girin?");
        String futbolcu = scanner.nextLine();
        
        futbolcular.futbolcuAra(futbolcu);
       
    }
    
    public static void islemleriGoster(){
        
        System.out.println("\t 0-İşlemleri Görüntüler");
        System.out.println("\t 1-Futbolcuları Görüntüle");
        System.out.println("\t 2-Futbolcu Ekle");
        System.out.println("\t 3-Futbolcu Güncelle");
        System.out.println("\t 4-Futbolcu Sil");
        System.out.println("\t 5-Futbolcu Ara");
        System.out.println("\t 6-ÇIKIŞ");
    }
    public static void main(String[] args) {
        System.out.println("***** Futbolcu uygulamasına hoşgeldiniz *****");
        islemleriGoster();
        
        boolean cikis = false;
        int islem ;
        
        while (!cikis){
            
            System.out.println("Bir işlem seçiniz?");
            islem = scanner.nextInt();
            scanner.nextLine();
            
            switch(islem){
                
                case 0: islemleriGoster();
                break;
                    
                case 1: goster();
                break;
                
                case 2: futbolcu_ekle();
                break;
                
                case 3: futbolcu_guncelle();
                break;
                
                case 4 : sil();
                break;
                
                case 5: ara();
                break;
                
                case 6: 
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor....");
                    break;
                      
            }
        }
        
    }
    
}
