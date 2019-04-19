public class TipDonusum{
    public static void main(String[] args){

        // تحويل الارقام من عشري لصحيح وباالعكس

        int    x = 10;
        float  y = 3.2F;
        double z = 5.3;
        int    s = (int) y;
        float  n = 4;
        float  q = x;
        int    c = (int) 45.64;
        float  f = x / y;  //  int    r = x / y; لا يجوز لان الناتج عدد عشري والمتغير من نوع عدد صحيح
        int    g =  x / 3;
        float  b =  x / s;  
        float  w = (float) x / s; 
        float  h = 3 / 2;
        float  l = (float) 3 / 2; 

        // طرق تحويل الرقم الى نص س

        int  sayi = 20;
        String s1 = sayi + "";              // yöntem 1
        String s2 = Integer.toString(sayi); // yöntem 2
        String s3 = String.valueOf(sayi);   // yöntem 3

        // طريقة تحويل نص الى رقم 

        String text = "15";
        int sayi1 = Integer.valueOf(text);  // yöntem 1
        int sayi2 = Integer.parseInt(text); //yöntem 2

        // طريقة تحويل الرقم العشري الى نص

        float sayi3  = 12.5F;
        double sayi4 = 10.9;

        String text1 = Float.toString(sayi3);
        String text2 = sayi3 + "";
        String text3 = String.valueOf(sayi3);
        String text4 = Double.toString(sayi4);
        String text5 = sayi4 + "";
        String text6 = String.valueOf(sayi4); 

        // طريقة تحويل النص الى عدد عشري

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

// يقوم هذا الكود بقراءة الارقام المرسلة عند تشغيل البرنامج وجمعهم مع بعض اي يجب عند تشغيل البرنامج ارسال ارقام
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

    }
}