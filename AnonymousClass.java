// isimsiz sınıflar (Anonymous Class)
/**
 * isimsiz sınıflar, isimsiz ifade edilebilen sınflardır.isimsiz sınıflar havada 
 * oluşturabildiklerinden dolayı bir çok işlem için çeok avantajidir, özeliklle
 * olay dinleyicilerin (event listeners) devreye sokulduğu uygularımlarda sıkça kullanılır.
 * isimsiz sınıflar direc extends ve implements anahtar kelimelerini kullanarak, diğer sınıflardan
 * türttilmez ve arayüzlere erişemez.
 * isimsiz sınıfların her hangi bir isim olmadığı için Yapılandırıcısında olamaz.
 * isimssiz sınflar bir metoun içinde de olurlar
 */
interface Toplayici{
    public int hesaplamaYap();
}
public class AnonymousClass{

    public Toplayici topla(final int a, final int b){ //topla method
        return new Toplayici(){ //Anaonymous Class
            public int hesaplamaYap(){ //overrride
                //final olan yerel değişkenler ulaşabilir
                return a + b;
            }
        }; //Anaonymous Class //Noktalı virgül şart
    } // topla method

    public static void main(String[] args) {
        AnonymousClass ac = new AnonymousClass();
        Toplayici t = ac.topla(5, 8);
        int sonuc = t.hesaplamaYap();
        System.out.println("Sonuc = 5 + 8 = " + sonuc);
    }
}
/**
 * AnonymousClass sınıf topla() yordamı Toplayici arayüz tipindeki nesneye bağlı bir referans geri dödürmektedir.
 * Toplayici arayüz tipindeki nesneye bağlı bir referans geri döndürmek demek,Toplayici arayüz erişip
 * onun gövdesiz yordamların iptal eden bir sınıf tipinde nesne oluşturmak demektir.Sonuçta bir arayüz
 * ulaşan sınıf ulaştığı arayüz tipinde olan bir referansa bağlanabilirdi 
 */
class A{
    public void getDate(){
        System.out.println("This is getDate method from class A");
    }
}
class B{
    public void run(){
        //Bu isimsiz sınıf burda A sınfında türetilidğini sayılır, Artık ordaki yordamları sahip oldu.
        new A(){ //Anonymous class 
            public void set(){
                System.out.println("This is set method from class B");
            }
        }.set();
        new A(){

        }.getDate();
    }
    public static void main(String[] args){
        B b = new B();
        b.run();
    }
}