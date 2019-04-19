public class Constructor{
    public static void main(String[] args){
        Example t1 = new Example(4, 9);
        Example t2 = new Example(78, 45);
        Example1 t3 = new Example1(100);
        System.out.println(t1.speed);
        System.out.println(t1.start);
        System.out.println(t2.speed);
        System.out.println(t2.start);
        System.out.println(t3.deger);

       // Araba r1 = new Araba(); bu hata çünkü constuctor fonksiyonu bir ya da iki parametre almalı.
        Araba r1 = new Araba(4);
        Araba r2 = new Araba(2, 6);
    }
}
class Example{
    public int speed;
    public int start;
    public int s = 10;

    /* şimdi constuctor fonksiyonu bir nesne yarıtırken hemen o nesneyi değer vermek
       için kullanılır ve her nesne ayrı bir değer verebiliriz.Eğer biz o fonksiyonu 
       oluştırmasak java kendini bir constuctor fonksiyonu oluşturur.
       O fonksiyonu değer fonksiyounları gibi parametre alabilir lakin tipi olamaz (int,...)
       ve hiç bir değer döndüremez.
       önemli bir not o fonksiyonunu adı class ile aynı adı olmalı.Hata harflar buyk ya da kucuk
       fark eder tam class adı ile aynı olmak zorunda 
    */
    
    // constuctor fonksiyonu
    public Example(int s, int start){
        this.speed = s;
        this.start = 0;
    }
    // constuctor fonksiyonu
    
    public void Max(){
        this.speed = s;
        System.out.println(this.speed);
    }
}

class Example1{
    int deger ;
    // constuctor fonksiyonu
    public Example1(int sayi){
        deger = sayi;
    }
    // constuctor fonksiyonu
}
class Araba{
    int kapi_sayisi;
    int vites_sayisi;

    /* 
        Not: Birden daha fazla constuctor fonksiyonu oluştırabiliriz lakin parametrenin sayisi
        ya da parametrenin tipi aynı olmamamsı lazım.
    */ 
    
    // constuctor fonksiyonu
    public Araba(int a){
        kapi_sayisi = a;
        vites_sayisi = 0;
        System.out.println("kapi sayisi = " + kapi_sayisi);
        System.out.println("vites_sayisi = " + vites_sayisi);
        System.out.println("---------------------");
    }
    public Araba(int a, int b){
        kapi_sayisi = a;
        vites_sayisi = b;
        System.out.println("kapi sayisi = " + kapi_sayisi);
        System.out.println("vites_sayisi = " + vites_sayisi);
    }
    // constuctor fonksiyonu
}