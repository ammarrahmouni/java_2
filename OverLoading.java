//Metod OverLoading
/**
 * Method Overloading

 * When methods have the same name, but different parameters, it is known as method overloading.
 * This can be very useful when you need the same method functionality for different types of parameters.
 * An overloaded method must have a different argument list; the parameters should differ in their type, number, or both. 
 */

public class OverLoading{

    /*
        Burdaki not şudur birden daha fazla aynı isim ile metotlar oluşturduk
        ve hata vermedi çünkü her metotun parmetrsinin tipi ayrıdır.Eğer iki 
        ya da daha fazle metotlar hem aynı isim hem aynı parametre tipi ve aynı 
        parametre sayisi o zaman hata verir.
    */
    /**
     * OverLoading metodu:o kavram demek ki birden daha fazla aynı adı ile metotlar
     * oluştırabilirsin lakin bu metotları paramterleri değişik olmalıdır.
     * Yani eğer iki metot varsa ve onları iki parametre varsa o zaman bu parametrlerin
     * tipleri farklı olmalıdır.Eğer iki tane metot varsa ve onları aynı tip sahip ise
     * o zaman birisi diğerinde bir parameter ya da iki... farketmez daha fazla olmalıdır. 
     */
    /*
     * overLoading metotun tipi ilgilendirilmez sadece parametrenin
     * tipi ve parametrenin sayısı ile ilgilenir. 
     * Not : iki metot aynı isim aynı parameter sayısı aynı parameter tipi 
     * lakin o metotların tipi farklı ise artık burda hata verir eğer klıtım yolu ile 
     * yada ayn class'ta her iki durum bu hatadır.
     */

    public int toplama(int a, int b){
        int sonuc = a + b;
        System.out.println("sonuc1 = " + sonuc);
        return sonuc;
    }
    public void toplama(int a, double b){
        double sonuc = a + b;
        System.out.println("sonuc2 = " + sonuc);
    }
    public double toplama(double a , int b){
        double sonuc = a + b;
        System.out.println("sonuc3 = " + sonuc);
        return sonuc;
    }
    public double toplama(double a, double b){
        double sonuc = a + b;
        System.out.println("sonuc4 = " + sonuc);
        return sonuc;

    }
    /**
     *  public void toplama(int a, int b){
     *  System.out.println("ass");
     *  } Hata! buras metotun tipi birinci meton tipi ile farklıdır ki 
     *  OverLodaing metorun tipi ile ilgilendirilmez.
     */


    public static void main(String[] args){
        OverLoading t = new OverLoading();
        t.toplama(3,4);
        t.toplama(3, 4.4);
        t.toplama(3.3, 4);
        t.toplama(3.3, 4.4);
    } 
} 