class Hesaplama3{
    private int sabit1 = 2;
    private static int sabit2 = 1;

    private void dekontBilgilerGoster(){
        System.out.println("Dekont Bilgileri gosteriliyor");
    }
    public void ekranaBas(int a, int b){
        int sonuc = new Toplama().toplamaYap(a ,b);
        System.out.println("sonuc = " + a + " + " + b + "sabit1 =" + sonuc);
    }

        public class Toplama{ //static olmayan dahili sınıf
        public int toplamaYap(int a, int b){
            //static int toplam; //Hata: static olmayan dahili sınıflar içersinde static olmayan yordamlar içerilbilir sadece
            return (a + b) + sabit1; //Dikkat
            //return (a + b) + sabit2; //dogru
            //hata vermez çünkü static olmayan yordamlar hem static hem de static olmayan değişkenler kullanabilir
        }
    }
        public class Cikarma{
        public int cikarmaYap(int a , int b){
            dekontBilgilerGoster();
            return (a - b) - sabit2;
        }
    }


    public static void main(String[] args){
        Hesaplama3 h = new Hesaplama3();
        h.ekranaBas(10 , 5);

        //Toplama işlemi
        Hesaplama3.Toplama ht = h.new Toplama();
        int sonuc = ht.toplamaYap(11 , 6);
        System.out.println("sonuc = 11 + 6 + sabit1 = "  + sonuc);

        //çikarma işlemi
        Hesaplama3.Cikarma hc = h.new Cikarma();
        int sonuc1 = hc.cikarmaYap(10 , 5);
        System.out.println("sonuc = 10 - 5 + sabit2 = "  + sonuc1);

    }
}