public class TypeCasting{
    public static void main(String[] args){

        // Convert int to float and float to int

        int    x = 10;
        float  y = 3.2F;
        double z = 5.3;
        int    s = (int) y;
        float  n = 4;
        float  q = x;
        int    c = (int) 45.64;
        float  f = x / y;  //  int r = x / y; olamaz çünkü sonuc float ve değişkenin tip int 
        int    g =  x / 3;
        float  b =  x / s;  
        float  w = (float) x / s; 
        float  h = 3 / 2;
        float  l = (float) 3 / 2; 

        // Convert int to String

        int  sayi = 20;
        String s1 = sayi + "";              // yöntem 1
        String s2 = Integer.toString(sayi); // yöntem 2
        String s3 = String.valueOf(sayi);   // yöntem 3

        // Convert String to int

        String text = "15";
        int sayi1 = Integer.valueOf(text);  // yöntem 1
        int sayi2 = Integer.parseInt(text); //yöntem 2

        // Convert double or float to String

        float sayi3  = 12.5F;
        double sayi4 = 10.9;

        String text1 = Float.toString(sayi3);
        String text2 = sayi3 + "";
        String text3 = String.valueOf(sayi3);
        String text4 = Double.toString(sayi4);
        String text5 = sayi4 + "";
        String text6 = String.valueOf(sayi4); 

        // Convert String to float or double

        String sayi5 = "25.74";

        float  text7  = Float.valueOf(sayi5);
        float  text8  = Float.parseFloat(sayi5);
        double text9  = Double.valueOf(sayi5);
        double text10 = Double.parseDouble(sayi5); 

        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("z:" + z);
        System.out.println("s:" + s);
        System.out.println("n:" + n);
        System.out.println("q:" + q);
        System.out.println("c:" + c);
        System.out.println("f:" + f);
        System.out.println("g:" + g);
        System.out.println("b:" + b);
        System.out.println("w:" + w);
        System.out.println("h:" + h);
        System.out.println("l:" + l);

        System.out.println("-----------");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("-----------");

        System.out.println(sayi1);
        System.out.println(sayi2);

        System.out.println("-----------");

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
        System.out.println(text5);
        System.out.println(text6);

        System.out.println("-----------");

        System.out.println(text7);
        System.out.println(text8);
        System.out.println(text9);
        System.out.println(text10);

    /* Bu satır biz programı değerlendikten sonra onu çalıştırıken iki değer gönderiyoruz ve o değeri alıp 
       int tipine dönüştryor ardığında o iki değer topluyor.
    */
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

    }
}
interface App{
    public void get();
}
class AdvanceTypeCasting implements App{
    public void get(){
        System.out.println("This is Advance Type Casting Class");
    }
    public void test(){
        System.out.println("This is Test method();");
    }
    public void change(App a){
        a.get();
        if(a instanceof AdvanceTypeCasting){
            //Burda demek ki gelen a parametreyi AdvanceTypeCasting tipine dönüştür ve obj değişkenide kaydett ve ordaki metotlar kullanbilirsin.
            AdvanceTypeCasting obj = (AdvanceTypeCasting) a;
            obj.test();
            //a.test(); //Hata
        }
        //a.test();   // Hata!
    }
    public static void main(String[] args) {
        AdvanceTypeCasting a = new AdvanceTypeCasting();
        a.change(a);

    }
}