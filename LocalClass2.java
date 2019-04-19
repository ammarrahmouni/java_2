class Hesaplama{

    public static int topla(int a, int b){// topla method
        int a_yedek = a;
        class Toplama{//class Toplama
            private int x; //doğru
            public int y; //doğru
            protected int z = a_yedek; //Doğru
            int p; //doğru
            public int degerDondur(){
                int deger = a; //Doğru
                int degerb = b;
                return a + b;
            }
        }//Class Toplama
        Toplama t = new Toplama();
        return t.degerDondur();
    }//topla method

    public void ekranaBas(){
        /* yerel sınıf sadece friendly erişim belirleyicisine sahip olabilirler
        public class Toplama1{
            public void test(){};
        }//class Toplama1  */
    }//metot ekranaBas
    public void hesaplamaYap(){
        /* static olmayan bir metotta static sınıf tanımlamaz
        static class Toplama2{
            public void test(){};
        }//class Toplama2  */
    }//metot hesaplamaYap

    public static void main(String[] args) {
        int sonuc = Hesaplama.topla(5 , 9);
        System.out.println("sonuc = " + sonuc);
    }
}//class Hesaplama