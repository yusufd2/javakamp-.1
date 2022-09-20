//  Harfe göre sınavdan geçme kalma durumu;

public class Main {
       public static void main(String[] args) {
           char harf = 'A' ;
           switch(harf) {
                case 'A' :
                   System.out.println(" Mükemmel : Geçtiniz");
                   break;
                case 'B' :
                    System.out.println(" Çok Güzel : Geçtiniz");
                    break;
                case 'C' :
                   System.out.println(" İyi : Geçtiniz");
                   break;
                case 'D' :
                   System.out.println(" Fena Değil : Geçtiniz);
                   break;
                case 'F':
                    System.out.println(" Maalesef Geçemediniz");
                    break;
                default:
                    System.out.println(" Geçersiz harf girdiniz.");
           }
     }
}