// En büyük sayı bulma;

public class Main {
       public static void main(String[] args) {
           int sayi1 = 20 ;
           int sayi2 = 21 ;
           int sayi3 = 22 ;
           int enBuyuk = sayi1;
           if(enBuyuk < sayi2) {
              enBuyuk = sayi2;
           }
           if(enBuyuk < sayi3) {
              enBuyuk = sayi3;
           }
           System.out.println("En büyük sayı =" + enBuyuk);
       }
}    