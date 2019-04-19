class Asker{
    public void selamVer(){
        System.out.println("Asker Selam Verdi");
    }
}
class Er extends Asker{
    @Override
    public void selamVer(){
        System.out.println("Er selam verdi");
    }
}
class Yuzbasi extends Asker{
    @Override
    public void selamVer(){
        System.out.println("Yuzbasi selam verdi");
    }
}
public class PolymorphismOrnekBir{
    public static void hazirOl(Asker a){
        a.selamVer(); // Dikkat;
    }
    public static void main(String[] args){
        Asker as = new Asker();
        Er er = new Er(); // Asker er = new Er(); Doğrudur : çünkü Er calss'i Asker calss'ından türetilmiş
        Yuzbasi yb = new Yuzbasi(); // Asker yp = new Yuzbasi();  Doğrudur
        hazirOl(as); // yukarı çevirim !yok!
        hazirOl(er); // yukarı çevirim(upcasting)
        hazirOl(yb); // yukarı çevirim(upcasting)
    }
}
/**
 * hazirOl(er);
 * Bu size ilk başta hata olarak gelebilir ,ama arada kalıtım ilşkisinden dolay(Er bir Askerdir)
 * nesneye yönelik programlama (oop) çerçevesinde bu olay doğrudur.
 * Hangi nesnenin selamVer() yordamı(metot) çağırlacaktır?Asker nesnesi mi?yoksa Er nesnesinin mi?
 * cevap: Er nesnesin selamVer() yordamı çağırılacaktır.çünkü Asker tipindeki yerel değişken (as) Er
 * nesnesine bağlanmıştır.Eğer Er nesnesinin selamVer() yordamı olmasaydı o zaman Asker nesnesine 
 * ait olan selamVer() yordamı çağırılcaktırfakat Er sınıfının içersinde ,ana sınıfa ait olan 
 * (Asker Sınıfı) selamVer() yordamı iptal edildiğinden (override) dolayı ,java ,Er nesnesinin
 * selamVer() yordamını çağırılacaktır.
 * Hangi nesnesin selamVer() yordamını çağırılacağı ne zaman belli olur ? Derlame anında mı(compiler-time)?
 * yoksa çalışma anında mı(run-time)? 
 * cevap: çalışma anında(run-time).Bunun sebebi ,derleme anında hazirOl() yordamına hangi tur nesneye 
 * ait referansın gönerdrileceğini belli olmamasıdır.
 * Eğer bir yordamın hangi nesneye ait olduğu çalışma anında belli oluyorsa bu olay geç bağlama(late-bindind)denir
 */