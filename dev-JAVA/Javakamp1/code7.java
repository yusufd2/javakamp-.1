// Dizilerde listedeki tüm öğrencilerin isimlerini ekrana yazdırma;

public class Main {
       public static void main(String[] args) {
          String[] ogrenciler = {"Eda", "Ayse", "Melisa", "Zeynep"};
          System.out.println(ogrenciler[0]) ; // Eda
          System.out.println(ogrenciler[1]) ; // Ayse
          System.out.println(ogrenciler[2]) ; // Melisa
          System.out.println(ogrenciler[3]) ; // Zeynep
          
          for(int i=0; i<ogrenciler.length; i++){
                System.out.println(ogrenciler[i]);
           }
        }
 }