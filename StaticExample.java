public class StaticExample{
    public static void main(String[] args){

        int result = Calucature.add(10, 5);
        System.out.println(result);

        result = Calucature.sul(10, 5);
        System.out.println(result);

        result = Calucature.mul(10, 5);
        System.out.println(result);

        result = Calucature.div(10, 5);
        System.out.println(result);
        System.out.println("--------------");
        // Bu kuçuk bir program object sayisi hesaplanır.
        // şimdi Burda Static kullanmasayıdık böyle bir şey yapamayacağız.
        TheCount t1 = new TheCount();
        TheCount t2 = new TheCount();
        TheCount t3 = new TheCount();
        TheCount t5 = new TheCount();
        TheCount t6 = new TheCount();
        System.out.println("The object count is : " + TheCount.count);
        System.out.println("--------------");
        TheCounts t7 = new TheCounts();
        TheCounts t8 = new TheCounts();
        TheCounts t9 = new TheCounts();
        TheCounts t10 = new TheCounts();
        TheCounts t11 = new TheCounts();
        TheCounts t12 = new TheCounts();
        System.out.println("The object count is : " + TheCounts.getCounts());

    }
}
 class Calucature{
    public static int add(int a, int b)
    {
        return a + b;
    }
    public static int sul(int a, int b)
    {
        return a - b;
    }
    public static int mul(int a, int b)
    {
        return a * b;
    }
    public static int div(int a, int b)
    {
        return a / b;
    }
}
class TheCount{
    public static int count = 0;
    public TheCount(){
        count++;
    }
}
class TheCounts{
    private static int counts = 0;
    public TheCounts(){
        counts++;
    } 
    public static int getCounts(){
        return TheCounts.counts;
    }
}