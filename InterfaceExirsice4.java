// Çakışmalar
/**
 * Bu program çalışmaz çünkü S2 class'inda iki interface implements 
 * yaparken (A1, A3) bunlar içinde aynı metot adı ve paramterleri aynı lakin 
 * tiplar farklı ve bu bildiğimiz gibi hatadır.Bu proplemi nasıl çözeceğiz?
 * A3 interface'inde hesapla(); metodu ya void tipini koyarız ya da 
 * bir ya daha fazla parametre koyarız.
 * Sonuc :  Eğer iki yada daha fazla interface aynı anda bir class'ta impelemts yapacaksa 
 * kesinlikele ordaki metotların çakışmaları dikkat etmemiz gerekir bu ornekteki
 * durum gibi.
 */
interface A1{
    public void hesapla();
}
interface A2{
    public void hesapla(int a);
}
interface A3{
    public int hesapla();
}
class S1 implements A1, A2{
    public void hesapla(){ //adaş yordamlr (overloaded)
        System.out.println("S1.hesapla()");
    }
    public void hesapla(int d){ //adaş yordamlr (overloaded)
        System.out.println("S1.hesapla() " + d);
    }
}
/**
 * Hata : adaş yordamları (overloaded) dönüş tiplerine göre ayrit edilemez
 */
class S2 implements A1,A3{
    public void hesapla(){
        System.out.println("S2.hesapla()");
        
    }
    
    /**
     * hata : 
     * public int hesapla(){
     * System.out.println("S2.hesapla()")
     * return 0;
     * }
     */
}
public class InterfaceExirsice4{
    public static void main(String[] args){
        S1 s1 = new S1();
        S2 s2 = new S2();
        s1.hesapla();
        s1.hesapla(5);
        System.out.println("-------------------------");
        s2.hesapla();
    }
}
/**
 * iki yordamın adaş yordam(overloaded method) olabilmesi için yordamların 
 * parametrelerinde kesin bir farklılık olması gerekiridi.iki yordamın dış tipleri dışında 
 * herşyler aynı ise bunlar adaş yordam olamazlar. Olmamalarının sebebi java'nin
 * bu yordamları dönüş tiplerine göre ayrıt edememesinden kaynaklanır.
 * Sonuç Önemli : iki metot aynı adı ile ve aynı paramtere sayısaı ve aynı parametrenin tipler
 * lakin dönüş tipleri farklı ise java'da bu hataleıdr çünkü java'nin
 * bu yordamları dönüş tiplerine göre ayrıt edememesinden kaynaklanır.
 */