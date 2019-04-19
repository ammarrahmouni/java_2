/**
 * Yerel sınıf (local class) yanlızca içinde tanımladıkları yordamın veya
 * bloğun içersinde geçerlidir.Nasıl ki dahil üye sınıfların çevreleyici sınıflar vardı
 * yerel sınıfların ise çevreleyici yordamlar veya bloklar vardır .Yerel sınıflar 
 * tanımlandıkları bu yordamların veya blockların deışarısında erişilemezler
 * Yerel sınıflar ait ilk özellikeri verilem :
 * Yerel sınıflar tamınlandıkları yordaımın veya bloğun dışında erişilemezler
 * Yerel sınıflar başka sınıflarından türetilebilir veya arayüzlere erişilebilir.
 * Yerel sınıfların Yapılndırıcları olabilir. 
 * Yerel sınıflar erişim beirleyici sahipi olamaz(yani: private, public, protected).
 * Not : metod içinde her yordam ve değşken ve class için erişim belirleyici sahip olamaz.
 * Yerel sınıf içinde static yordamları tanımlamayız.
 * Yerel sınıf static olarak tanımlamayız nedendi çünkü o class metodun içinde
 * olduğu için çünkü bildiğimiz gib bir metod içinde static Yordamları tanımlamayız.
 * Yerel sınıf block'un (Bulunduğu metotun) içinde ya dışındaki yordamlar 
 * erişilebilir bu yordamın erişim tipi ne olursa olsun.Hata bu yordamları static 
 * olup ya olamdığını fark etmez.
 * Not : Eğer bir metot static tipine sahip ve onun içinde bir yerel sınıf tanımlanmak 
 * istiyorsak o class static  olamaz yani sonuc metotud tipi ne olursa olsun 
 * içindeki yerel sınıf ne erişim belirleyici sahip olur ne da static tipi sahip olur.
 */

interface Toplayici{
    public int hesaplamaYap();
}

class Hesaplama{ 
    public  int s = 4;
    public int topla(int a, int b){ //topla method
        int r = 8;
        //public int e; // Hata
        //static int f; //Hata
        class Toplama implements Toplayici{ //Local class Toplama
            private int deger1;
            private int deger2;
            //public static int v; //Hata
            public Toplama(int a, int b){ //Yapılandırıc
                this.deger1 = a;
                //this.deger1 = a + s + r; // Doğru
                this.deger2 = b;
            }//Yapılandırıcı

            public int hesaplamaYap(){ //override(hesaplamaYap metodu)
                return deger1 + deger2;
            } //hesaplamaYap method

        }//Local class Toplama
        /** Hata çünkü Local class'in erişim tipi sahip olamaz
         *public class Cikarma{
            //yordamlar
        }
         */
        Toplama t = new Toplama(a,b);
        return t.hesaplamaYap();

    }//topla method

    public void ekranaBas(){ //ekranaBas method
        //Toplama t = new Toplama(4, 7); //Hata kapsanma alanına dışı
    }//ekranaBas method

    public static void main(String[] args){
        Hesaplama h = new Hesaplama();
        int sonuc = h.topla(5,9);
        System.out.println("Sonuc = " + sonuc);
    }
}//class Hesaplama