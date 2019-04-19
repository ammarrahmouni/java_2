// super ile constructor Nasıl çalışır.
/*
 * Burda biz SuperClass sınıfı bir constructor fonk oluşturduk,
 * parametreli bu çoooook önemli eğer  constructor fonk parametresiz 
 * ise o zaman super kullnılamya gerk yoktur.
 * zaten eğer construtor parametresiz ise işet ordaki java gizli ve otomatik
 * olarak her subclass'inda bir super(); koyuyor.ve biz değer koyarsak hata vermez lakin gereksiz olacak
 * şimdi dikkat edilmemiz gereken o sınıftan 
 * türevlenen sınıfları için kesinlikle bir consrtuctor fonk 
 * olşturmalıdır.O fonksiyonları içinde kesin ve kesin 
 * superclass'taki constructor fonk çağırması gerek ve 
 * birinci satır çağırılmalıdır.Işte burda o fonk çağırmak
 * için super kelimes kullanacağız ve gerekli dğerler atıyoruz.
 */
class Helper{
    int value ;
    String name;
    int x;

    public Helper(int value, String name){
        this(7);  //burda ikinci constructor fonk çağırdık.
        this.value  = value;
        this.name = name;
    }
    public Helper(int value){
        //this(4, "dsa"); //Hata! çünkü öyle yaparsak işlem sonsuza gider(Recursive Metot)
        this.x = value;
        
    }
}
class Provider extends Helper{
    public Provider(){
        super(10,"Mehmet");
        // super(14); Hata!-sadece tek bir constructor çağırılır.Eğer bunu yazacaksak üstündeki satırı silmemiz gerek.
    }
}
class Exception extends Helper{
    /*
     * Dikkat!!!! Burda Exception class Helper class'tan türedildiği için
     * bir constructor fonk oluşturduk ve ona super kelimesi kullanarak 
     * parent class'taki yani (Halper) class'taki constructor fonk çağırdık.
     * Eğer Exception class'i Provider class'inda türevlenseydi constructor fonk kullanmayı
     * gerek duymayacak çünkü;Provider class'i içindeki constructor fonk parameter 
     * almıyor.Dolayısıyla Her object bu class'indan olşturursak Provider
     * calss'i Helper class'i gönderdiği değer alacaktır.
     * şöyle düşüneyelim : biz Exception class'i Provider calss'indan türevlendiğini
     * düşünürsek java otomatik olarak bir constructor fonk olşturacak
     * şimdi Provider class'i bir paramteresiz constructor olduğu için java da 
     * otomatik olarak Exception constructor'içinde super() koyacak.ardığında bu super();
     * Provider constructor çağracaktır.ondan dolay Eğer Exception class'i
     * Provider class'indan türetildiysek ordaki işlemler java otomatik olarak yapacaktır
     * (Lakin Eğer Exception class'i Provider class'inda türevlenseydi).
     */
    public Exception(){
        super(4, "Ahmet");
    }
}
class Roman{
    int deger;
    public Roman(){
        this.deger = 150;
    }
    public Roman(int s){
        this.deger = s;
    }
}
class Ask extends Roman{
    /**
     * Burda gürdüğümüz gibib Roman class'ında constructor fonk prametersizi
     * oldduğu için constructor ve super kullanmadık ve her object Ask class'ında
     * oluşturduğumuzda değer değişkeni 150 değeri alacaktır.
     * aslında java constructor ve super(); bunlar otomatik olarak oluşturdu
     */
    
}
class Tarih extends Roman{
    /**
     * Burda construtor fonk oluşturduk program o fonk içersinde girdi
     * sonra onun Babası yani parent class'in constructor fonk girdi ve
     * değer değişkeni 150 değer verdi sonra tekrar Tarih class'inde 
     * constructor fonk girdi ve değer değişkeni değeri düzenledi 120 oldu.
     */
    public Tarih(){
        this.deger = 120;
    }
}
/**
 * Özet: Ana sınıfı ait yapılandırıcı çağırma işlemi,varsayılan ypılandırıcılar 
 * için ototmatik olarak yürürken,parametre alan yapılandırıcılar için olaylar 
 * bir az daha değişiktir.Kısacası,ana sınıfın parametre alan yapılandırıcısını 
 * açık olarak super anahtar kelimesi ile çağırmak gereklidir.Super()metodu 
 * alt sınıftaki yapıcının içerisinde ilk sırada yazılmak zorundadır.
 */
public class SuperConstructor{
    public static void main(String[] args){
        Helper h = new Helper(5,"Ammar");
        Provider p = new Provider();
        Exception e = new Exception();
        Ask a = new Ask();
        Tarih t = new Tarih();
        System.out.println("h.value = " + h.value);
        System.out.println("h.name = " + h.name);
        System.out.println("h.x = " + h.x);
        System.out.println("p.value = " + p.value);
        System.out.println("p.name = " + p.name);
        System.out.println("p.x = " + p.x);
        System.out.println("e.value = " + e.value);
        System.out.println("e.name = " + e.name);
        System.out.println("e.x = " + e.x);
        System.out.println("A.deger = " + a.deger);
        System.out.println("T.deger = " + t.deger);
    }
}
