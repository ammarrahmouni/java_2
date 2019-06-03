//Neden Dahili sınıflar

class Anasinif{
    public void ekranaBas(String deger){
        System.out.println(deger);
        //System.out.println(deger + deger); //Doğru
    }
}
class B{
    public String degerDondur(){
        return "B";
    }
}
class C{
    public int topla(int a, int b){
        return a + b;
    }
}
class TuretilmisSinif extends Anasinif{
    public class BB extends B{
        public BB(){
            ekranaBas("sonuc = " + degerDondur());
        }
    
    }
    public class CC extends C{
        public CC(int a ,int b){
            ekranaBas("sonuc = " + topla(a,b));
            ekranaBas(5 + "5" + 5); // Doğru
            ekranaBas("5" + "5");//Doğru
            //ekranaBas(5 + 5); //Hata
            //ekranaBas(5); //Hata
        }
        
    }
    public static void main(String[] args) {
        TuretilmisSinif.BB tbb = new TuretilmisSinif().new BB();
        TuretilmisSinif.CC tcc = new TuretilmisSinif().new CC(6, 9);
    }
}
/**
 * B sınıfından türetilmiş BB sınıfı ve C sınıfından türetilmiş CC sınıfı Anasinifi
 * sınıfa ait ekreanaBas() tordamın kullanarak sonuçlarını ekrana yansıtabilmektedirler.
 * Olaylar bu açıdan bakılacak olursa, TuretilmisSinif sınıfın sanki üç ayrı işleyen 
 * sınıftan gövenli ve kolay bir şekilde türetimiş olduğu görülür 
 */