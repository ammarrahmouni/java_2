//Bir Yapılandırıcıdan (Constructor)  Diğer Bir Yapılandırıcı Çağırmak (this ile mümkün).

public class ThisConstructor{
    int sayi;
    String malzeme;

    public ThisConstructor(){
        this(5);
        /*  
            Yapılandırıcılar(Constructor) içerisinden birde fazla
            this ifadesi ile başka yapılandırıcı çağrılamaz.
            this(5, "ammar");   Hata!-iki this kullanılmaz.
        */
        System.out.println("parametresiz yapilandirici");
    }
    public ThisConstructor(int sayi){
        //Yapılandırıcı içersinden diğer bir yapılandırıcı çağrırken this ifadesi her zaman ilk satırda yazılamalıdır.
        this(sayi, "Sucuklu");
        this.sayi = sayi;
        System.out.println("Tost (int sayi) " );
    }
    public ThisConstructor(int sayi, String malzeme){
        this.sayi = sayi;
        this.malzeme = malzeme;
        System.out.println("Tost (int sayi, String malzeme) " );
    }
    public void SiparsGoster(){
        //this(5, "Sucuklu") Hata!-sadece Yapılandırıclarda kullanılır.
        System.out.println("Tost sayisi = " + sayi + ", malzeme = " + malzeme);
    }

    public static void main(String[] args){
        ThisConstructor t = new ThisConstructor();
        t.SiparsGoster();
    }
}