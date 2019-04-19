//OverRiding
/**
 * Overriding:türkçesi iptal etmek, Kısacası Ana sınıf içersinde tanımlanmış bir yordam 
 * ana sınıftan türeyen bir alt sınıfın (subClass) içersinde iptal edilebilir.
 * overrida yazarsak o zaman olşturacağımız metot ana sınıfın 
 * metot ile aynı isim ve tip ve aynı parametre sayisi ve ayni parameter tipi olamlıdır.
 */
class Programer{
    public void Main(int a){
        System.out.println("Programer class: " + a);
    }

}
class Hack extends Programer{
    @Override
    public void Main(int b){
        System.out.println("Hack class : " + b);
    }
}
class OverRiding{
    public static void main(String[]  args){
        Programer p = new Programer();
        Hack h = new Hack();
        p.Main(5);
        h.Main(4);
    }
}

//Başka ornek
class Kitap {
    public int sayfaSayisi(){
        System.out.println("Kitap-sayfaSayisi() ");
        return 440;
    }
    public double fiyat(){
        System.out.println("kitap-fiyat() ");
        return 250;
    }
    public String yazarIsmi(){
        System.out.println("kitap-yazarIsmi() ");
        return "Ammar";
    }

}

class Roman extends Kitap{
    @Override //Bir ana sınıfın aynı yordamları olştırmak istiyorsak @override kelmesi yazmalıdır
    public int sayfaSayisi(){
        System.out.println("Roman-sayfaSayisi() ");
        return 500;
    }
    @Override 
    public double fiyat(){
        System.out.println("Roman-fiyat() ");
        return 150;
    }
    /**
     *  public String yazarIsmi(double a){
     *  System.out.println("Roman class");
     *  return "asd";
     *  }
     *  Burda bu metotu override olamaz çünkü ana sınıfın metotu ile 
     *  parametre alınması ile farkıldır.Burdaki işlem Overloading.
     */

    /**
     * Roman sınıfın içersinde ana sınıfa ait yordamların aynılarını tanımlandıktan sonra
     * Roman sınıfın yordamlarını çağrınca artık otomatik olarak ana sınıfın yordamları
     * devreye girmadi.Bunun yerine Roman sınıfın yordamları devreye girdi.Yani Roman
     * sınıfı türetildiği sınıfın (kitap) sayfaSayisi() ve fiyat() yordamlarını 
     * iptal etmiş(override) oldu.
     */
    public static void main(String[] args){
        Roman r = new Roman();
        int sayfasayisi = r.sayfaSayisi();
        double fiyats = r.fiyat();
        String yazar = r.yazarIsmi();
        System.out.println(sayfasayisi);
        System.out.println(fiyats);
        System.out.println(yazar);
    }
}
/**
 * Özet:Biz eğer aynı metot adı ile fonk oluşturursak eğer superclass'ın içinde 
 * ya da subClass'ında ve bunlar parametreleri farklıdır ya paramter sayisi ya da
 * paramterenin tipi o zaman bu işlem (Overloading) adaş yordamların olur (yani Ekleme gibi sayılabilir.)
 * Şimdi Eğer subClass'ında bir fonk oluşturusak ve o fonk superClass'ında fonk
 * aynı adı,tipi,parametre sayisi ve parametre tipi o zaman burddaki işlem 
 * adı Overriding(iptal etmek).Override işlem sadece supClass'da olur.
 * ve OverLoading hem superClass hem de supClass da olur.
 */