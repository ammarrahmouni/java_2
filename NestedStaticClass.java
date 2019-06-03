/**
 * Static dahil üye sınıflar ait bir nesne oluşturmak için onun çevreleyici
 * sınıfta ait bir nesne olutşturmak zorunda değiliz.
 * şimdi static olan dahili class'lar outer calss'ina sadece ve sadece 
 * static olan metolar ya değişkenler ile kullanabilir.ama static olmayan dahili class'lar
 * outer class'i static olup ya olmasın metotlar yada değişkenler ile kullanabilir.
 * o static dahili class içinde static yordamlar ya static olmayan yordamlar
 * içerilebilir.lkain static olmayan dahili calss'lar sadece static olmayan
 * değişkenler ya da metotlar içerilebilir.
 * 
 */
class Hesaplama4{
    int sabit = 2;
    private int ozelsabit = 1;
    public static int r = 5;
    public void ekranaBas(){
        System.out.println("Hesaplama4.ekranaBas();");
    }
    public static class Toplama{ // static uye dahil sınıf
        static int toplam; //dogru
        int sonuc; //dogru
        public int toplamYap(int a, int b){
            // return a + b + sabit; //Hata çünkü sabit değişkeni static değildir
            sonuc = toplam = a + b + r; //hem static hem de static olmayan değişkenler kullanabilir çünkü metod static değildir
            return sonuc;
            /*
                Toplama static dahili üye sınıfın toplamaYap() yordamının  içersinde 
                Hesaplama4 sınıfa ait global olarak tanımlamış ilkel (primivate)
                int tipindeki sabit alana direk erişilmez.(static olmayan yordamlar bahsediyoruz)
            */
        
        }
        public void dekontOlustur(){
            /*
            sabit, ozelsabit değişkeni ve ekranaBas() yordamına ulaşbilmek 
            için Hesaplama4 sınıfına ait nesne oluşturmamız gerek çünkü bunlar static değil.
            */
            /*
            eğer static dahili üye sınıfın içersinden onu cevreyleyn sınıfa ait
            bir alan (static olmayan ) veya yordam (static olmayan)
            çağırılmak istiyorsak bu bizzet ifade edilmelidir
            */
            Hesaplama4 hs4 = new Hesaplama4(); //Dikkat
            int a = hs4.ozelsabit; //dogru
            hs4.ekranaBas(); //dogru
            System.out.println("DEkont olusturulyor = " + hs4.sabit + " - " + a + r);
        }
    }//class Toplama
    public class Cikartma{//uye Dahili sınıf
        public final static int t = 8; //Onemli Eğer bu değişken sabit ise onu static olarak tanımlanabiliriz.
                                        //Bu sadece değeşkneler ile olur ama metotlar ile olamaz.
        int sonuc;
        // static int sonuc2; //hata
        /*
            static olmayan dahili üye sınıflarını içersinde static global alan tanımlanmaz
        */
        /**
         * Hata
         * public staitc int cikarmaYap(int a, int b){
         *  return a - b;
         * }
         */
        public int cikarmaYap(int a, int b){
            ekranaBas(); //Dikkat
            sonuc = a - b - ozelsabit;
            return sonuc; //Dikkat
            //return r; dogru çünkü static olmayan dahili sınıflar hem static
            // hem de static olmayan değişkenler kullanabilir
        }
    }//class Cikartma

    public static void main(String[] args){
        //Hata
        //Hesaplama4.Toplama t = new Hesaplama4().new Toplama();
        /*
            Toplama4 static dahili üye sınıfa ait nesne oluşturuken onu cevreleyen sınıfa 
            ait herhangi bir nesne oluşturma zorunda kalmadık 
        */
        //Hesaplama4.Toplama t = new Hesaplama4.Toplama(); //dogru
        Toplama t = new Toplama();
        t.dekontOlustur();
        int sonuc = t.toplamYap(10, 5);
        System.out.println("sounc = " + sonuc);
        System.out.println("---------------");
        //Cikatma hc = new Cikartma(); //Hata static değil 
        Hesaplama4.Cikartma hc = new Hesaplama4().new Cikartma();
        int sonuc1 = hc.cikarmaYap(10 , 6);
        System.out.println("sounc1 = " + sonuc1);
    }
}//class Hesaplama4
class Hesaplama5{
    public static void main(String[] args){
        //Hata
        //Hesaplama4.Toplama ht = new Hesaplama4().new Toplama();
        //Toplama ht = new Toplama(); //Hata çünkü içinde değildir
        Hesaplama4.Toplama ht = new Hesaplama4.Toplama();
        int sonuc = ht.toplamYap(10 , 5);
        System.out.println("sonuc = " + sonuc);
        /**
         * Başka bir sınıfın içersinde static dahil üye sınıf ulaşmak için 
         * sadece tanımlama açısından dahil uye sınıf cevreylen sınıfın ismi
         * kullanılmıştır.Mantıklı olan budur, static de olsa sonuçta ulaşmak 
         * istenen dahil üye bir sınıfdır.
         */
    }
}//class Hesaplama5
class Hesaplama6{
    private static int x = 3;
    public static class Toplama{ //statik dahil uye sınıf
        static int toplam; //dogru
        int sonuc; //dogru
        public static int toplamaYap(int a, int b){
            // sonuc = a + b + x; //Hata : çünkü Sonuc değişkeni static tanımlı olmadığı için
            /**
             * Not Önemli : Eğer bir metot static tanımlarsak kesinlikle ve kesinlikle
             * o metodun deışında bir değişken kullanacaksak o değişken static olmak zorunda
             * static olmayan metotlar onun dışında hem static hem de static olmayan 
             * değişkenler kullanabilir.static olan değişkenler kesinlikle metotlar içinde
             * tanımlamayız , o metot ne olursa olsun.
             */
            toplam = a + b + x;
            return toplam;
        }
    }//calss toplama
    public static void main(String[] args){
        int sonuc = Hesaplama6.Toplama.toplamaYap(10, 5); //Dikkat
        System.out.println("Sonuc = " + sonuc);
    }
}//class Hesaplama6