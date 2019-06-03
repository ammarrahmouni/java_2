//Final With Class
/**
 * Şimdi Final kelmesi Class birlikte kullandığımızde demeki bu 
 * class Her hangi bir class Türetilmez!!!.Yani extends yapamayız.
 * Final sınıflar komposizyon yöntemi ile kullanılabilir aşağıda gibi.
 */
final class A{
    public final int x = 0;
    public final void write(){
        System.out.println("WelCome");
    }
    public void open(){
        System.out.println("Open the Book");
    
    }
}
/* class B extends A{
    Hata!-çünkü A Class'i Final tipinde yani her hangi bir class türetimez.
 }
*/
public class FinalWithClass{
    public static void main(String[] args){
        //Komposizyon Yöntemi
        A a = new A();
        a.write();
        a.open();
    }
}


final class Kutu{
    int i = 0;
}
final class FinalOrnek{
    public final int X_SABIT_DEGER = 34; 
    public final static int Y_SABIT_DEGER = 36; 
    public final int A_SABIT_DEGER = (int) (Math.random() * 50);//Bu alanın degeri çalışma anında belli olacaktır.
    final Kutu k = new Kutu();
    public static void main(String[] args){
        FinalOrnek fo = new FinalOrnek();
        //fo.X_SABIT_DEGER = 15; Hata!
        //fo.Y_SABIT_DEGER = 16; Hata!
        //fo.A_SABIT_DEGER = 17; Hata!
        fo.k.i = 35;
        /**
         * Kutu sınıf tipindeki k alanını final yaparak ,bu alanın başka
         * bir kutu nesnesine tekrardan bağlınmasına izin veremeyiz ama kutu 
         * sınıf tipindeki k alanın bağlı olduğu nesnein içeriği değişebilir.
         */
         // fo.k = new Kutu(); Hata!
        
        System.out.println("X_SABIT_DEGER = " + fo.X_SABIT_DEGER);
        System.out.println("Y_SABIT_DEGER = " + fo.Y_SABIT_DEGER);
        System.out.println("A_SABIT_DEGER = " + fo.A_SABIT_DEGER);
        System.out.println("Kutu.i = " + fo.k.i);
    }
}
