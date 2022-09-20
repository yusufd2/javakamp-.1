// Bir listede verilen rasyonel sayıların toplamını yapma;

public class Main {
       public static void main(String[] args) {
          double[] liste = {1.2, 2.6, 354.64, 43.8};
          double toplam = 0;
          for( double numara : liste){
              toplam = toplam + numara;
              System.out.println(numara);
          }
          System.out.println("Toplam="+ toplam);
        }
 }