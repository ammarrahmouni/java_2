// Final Ne demek 
/**
 * kural 1:Şimdi Final kelimesi eğer değişkenler ile beraber kullanılırsak o zaman demek ki
 * bu değişkenin değeri hiç bir zamanda değiştiremeyiz.Onun Değeri ya o dğişkeni 
 * oluştururken verilir ya da constructor fonk ile verilbilir.Şimdi Normal
 * değişkenler eğer değri vermezsek ve onu yazdırmak istiyorsak ekrand 0 gösterilir
 * lakin Final değişkenlerde hata verir çünkü onu kesinlikle bir değer vermeliyiz. 
 */
/**
 * Kural 2:Eğer biz bir class'tan bir kaç tane object oluştırmak istiyorsak
 * ve o class'ın içinde bir değişken Final tanımlanmışsak ve Bütün objectleri
 * ordaki değişken aynı değeri veririrsek böylece hafızada çok yere alacak
 * çünkü 100 object olşturduğmuzu düşenyelim int tipinde o zaman RAM'da
 * 400 byte gidecek Lakin eğer o değişken static olarak tanımlanmışsak 
 * bütün objectleri tek bir yer alacak yani 4 byte sadece böyle daha çok
 * Bellekte yer kazanmış oluruz ve o değişkeni de sabit kaldı.
 */
class Exirsice{
    // Bir Dairenin çevrimi Hesaplanan Bir programdır(Final ve static Faydalarak).
    public final double r; //Her dairenin Ayrı bir çapı olacağı için ve o değere sabit olacağı için final kullandık.
    public final static double pi = 3.14; //Her Daire pi değeri değiş olmayacak için onu static olarak tanımladık.
    public double result;
    public Exirsice(double r){
        this.r = r;
    }
    public double hesap(){
        return result = (2 * pi * this.r); 
    }
}

public class FinalWithVariables{
    public int x ;
    public final int y; 
    //y = 10; Böyle yapamayız çünkü y sabittir.Değri ya oluştururken verir ya da constructor fonk ile verir.
    public final static int z = 55;
    public FinalWithVariables(){
        this.x = 10;
        this.y = 40;
    }
    public static void main(String[] args){
        FinalWithVariables f = new FinalWithVariables();
        FinalWithVariables w = new FinalWithVariables();
        System.out.println("X ilk degeri: " + f.x);
        System.out.println("Y(Final) ilk degeri: " + f.y);
        System.out.println("Z(Fianl) ilk degeri: " + f.z);
        System.out.println("Z(Fianl) ilk degeri: " + w.z);
        System.out.println("---------------------");
        f.x = 125;
        System.out.println("X ikinci degeri: " + f.x);
        System.out.println("Y(Final) ikinci degeri: " + f.y);
        System.out.println("Z(Fianl) ikinci degeri: " + f.z);
        System.out.println("Z(Fianl) ikinci degeri: " + w.z);
        System.out.println("---------------------");
        //f.y = 45;f.z = 12; yazamayız çünkü onlar sabit
        Exirsice e = new Exirsice(1.4);
        Exirsice e1 = new Exirsice(4.5);
        Exirsice e2 = new Exirsice(7.2);
        System.out.println("Birinci Dairenin cevrimi: " + e.hesap());
        System.out.println("Ikinci Dairenin cevrimi: " + e1.hesap());
        System.out.println("Ucuncu Dairenin cevrimi: " + e2.hesap());
        
    }
}
