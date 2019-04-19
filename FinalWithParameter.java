//Final With Parameter
/**
 * Final parameter ile gelirken demek ki biz o gelen değerler hiç bir 
 * zaman değiştiremeyiz.
 */
class A{
    public void write(int a, int b){
        //Burda gönderilen dğerle değiştirebildik
        a = 10;
        b = 7;
        System.out.println("A = " + a + ", B = " + b);
    }
    public void read(final int a, final int b){
        // a = 10; Hata!!-çünkü parametre alaçağı değerler sabittir
        // b = 7;  Değiştiremeyiz.
        System.out.println("A = " + a + ", B = " + b);
    }
}
public class FinalWithParameter{
    public static void main(String[] args){
        A a = new A();
        a.write(5,6);
        a.read(4,8);
    }
}
//Bask ornek
class Exirsice{
    public static int topla(final int a, final int b){
        // a = 10; Hata!!-çünkü parametre alaçağı değerler sabittir
        // b = 7;  Değiştiremeyiz.
        return a + b;
    }
    public static void main(String[] args){
        if( args.length != 2 ){
            System.out.println("Eksik veri Girildi.");
            System.exit(-1); // Uygulamayı kapat.
        }
        final int a = Integer.valueOf(args[0]);
        final int b = Integer.parseInt(args[1]);
        final int sonuc = Exirsice.topla(a,b);
        System.out.println("Sonuc = " + sonuc);
    }
}
