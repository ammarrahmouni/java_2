/* 
* Motor sınıfın private erişimi belirleycisine sahip olan 
* motor_gucu alanına, Ailearabası sınıfın içersinde ulaşamayız.
* Ailearabasi sınıfı Motor sınıfının sadece iki adet public 
* metode erişilebilir:calis(), dur()
*/
class Motor{
    private static int motor_gucu = 3600;
    public void calis(){
        System.out.println("Moto calisiyor");
    }
    public void dur(){
        System.out.println("Motor dur");
    }
}
public class AileArabasi{
    /*
    *burda çok karışık bir şey yapmadık saece 
    * Bir object olşturduk lakin main fonksiyonun içinde değil
    * dışında ve onunle birlikte fonksiyonlar da oluşturduk  
    */
    //Burda private koysak ya koymasak hiç bir şey değiştiremez.
    /**
     * Burda private ne zaman etkili olacak ?
     * Eğer AileArabsai başk class'inda ondan başka bir class'ind bir object oluşturusak ardğından 
     * o AileArabsi içindeki şu (m) nesnesi kullanmak istiyorsak
     * o zaman etkili olur.Eğer o private ise biz o object ordaki class'in 
     * içinde kullanamayız.lakin (r) nesnesi public olduğu için kullanabiliriz.
     */
    private Motor m = new Motor(); 
    public Motor r = new Motor();
    public void hareketEt(){
        m.calis();
        System.out.println("Aile arabasi calisiyor");
    }
    public void dur(){
        m.dur();
        System.out.println("Aile arabasi durdu");
    }
    public static void main(String[] args){
        AileArabasi aa = new AileArabasi();
        aa.hareketEt();
        aa.dur();
        
    }
}
class Ucak{
    public static void main(String[] args){
        AileArabasi ab = new AileArabasi();
        //ab.m.dur(); //Hata çünkü m private ona erişemeyiz
        ab.r.dur(); // dogru
    }
}

