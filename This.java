public class This{
    public static void main(String[] args){
        Car a = new Car();
        Car b = new Car();

        /* 
            1-this bir nesne yarıtırıken o nesneyi (this) yerine alır
            2-this isim çakışmaların olduğu durumlarda bir yerel değişkenin değil de nesene
            değişkenin kullanılacağını belirtmek için kullanılır
        */

        /* 
            Önmeli!!!!!! bir fonksiyoun eğer tipi void ise o fonksiyonu yazdıramasın!!
            ve eğer tipi (int, float, ...) bir return olamalı ve o değeri bilmek için 
            o fonksiyonu yazdırmalısın ya da bir değişkende  koyarsın ve o değişkeni yazdırırısn
        */

        /*  
            NOT: Java^da .java uzantılı dosya içersinde  birden fazla sınıf kullanacaksak
            yalnızca bir tanesi public olarak tanımlanabilir.Aynı yerde birden fazla sınıf
            public olamaz
        */
        
        System.out.println(a.Speed());
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(b.Speed());
        System.out.println(b.x);
        System.out.println(b.y);
        a.Test();
        a.All("AMMAR");

        Today t = new Today();
        t.gunekle(2);
        t.gunekle(3);
        t.gunekranabas();

        Yumurta y = new Yumurta();

        /* 
            Bu işlem sadece fonksiuonlarin class tipinde olur yani Eğer fonksiyonun tipi 
            (int, float, void, ....) hata verir.
            Bu işlem sadece fonksiyonun class tipinde ile diğer tipler ile olur.
            (int il void, float ile int, ...... olmaz).
            sadece(class tipi il int, class tipi il void, class tipi il float,.....)
        */

        y.sepetekoy().sepetekoy().sepetekoy().sepetekoy().goster(); 
       // System.out.println(y.sepetekoy()); //sepetkoy(); fonk bir object döndüryor eğer onu yazdırırsak sonuc : Yumurta@1db9742
    }
}

class Car{
    public int x ;
    public int y ;
    public String s;

    public int Speed(){
        this.y = 5;
        this.x = 10;
        return x;
    }
    public void Test(){
        System.out.println(this.Speed());
    }
    public void All(String s){
        this.s = s;
        System.out.println(s);
    }
}

class Today{
    /* 
        Şimdi burda eğer this kelimesi kullanmasaydık sonuc gun = 0 verecek 
        çünkü parametrenin adı ile değişkenin adı aynı bunlar karşlaştırılmaması
        için this anahtarı kullanıyoruz.şimdei neden 0 çıkıyor?
        çünkü gun değeri 0'dır ve biz gun değeri gönderdiğimizde eski değeri alıyor
        yani 0 değeri.
    */
    int ayi, gun, yil;
    public void gunekle(int gun){
        this.gun += gun;
    }
    public void gunekranabas(){
        System.out.println("Gun = " + gun);
    }

}

class Yumurta{
    
    int toplam_yumrta_sayisi;
    public Yumurta sepetekoy(){
        toplam_yumrta_sayisi ++;
        return this;  // burda bir fonksiyonun tipi Yumurta bir nesneyi döndürür.
                      // return yazmak zorundayız.
    }
    public void goster(){
        System.out.println("Toplam yumrta sayisi = " + toplam_yumrta_sayisi);
    }

}