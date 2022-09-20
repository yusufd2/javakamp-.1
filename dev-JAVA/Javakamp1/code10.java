// Bugün hava çok güzel cümlesinin eleman sayısını ve 5. elemanın ne olduğunu bulduran kod;


public class Main {
       public static void main(String[] args) {
          String mesaj = "Bugün hava çok güzel";
          System.out.println(mesaj);
          
          System.out.println("Eleman sayısı : " +mesaj.length());
          System.out.println("5. eleman :" + mesaj.caharAt(4));
       }
}