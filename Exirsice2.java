class SimpleCalc{
    private int x;
    private int y;

    public SimpleCalc(){
        this.x = 0;
        this.y = 0;
    }
    public SimpleCalc(int a, int b){
        this.x = a;
        this.y = b;
    }
    public int Add(){
        return this.x + this.y;
    }
    public int Sub(){
        return this.x - this.y;
    }
    //Encapsulation
    public void setX(int a){
        this.x = a;
    }
    public int getX(){
        return x;
    }
    public void setY(int a){
        this.y = a;
    }
    public int getY(){
        return y;
    }

}
class SimpleCalc1 extends SimpleCalc{
    public SimpleCalc1(){
        super();
    }
    public SimpleCalc1(int a, int b){
        super(a, b);
    }
    public int Mult(){
        return this.getX() * this.getY();
    }
    public double Div(){
        if(this.getY() == 0)
        {
            System.out.println("Hata! 0'a bölemez");
            return 0;
        }
        else
            return (double)this.getX() / (double)this.getY();
        
    }
}
public class Exirsice2{
    public static void main(String[] args){
        SimpleCalc test = new SimpleCalc();
        System.out.println(test.Add());
        SimpleCalc s = new SimpleCalc(5, 6);
        System.out.println("sonuc1 = " + s.Add());
        System.out.println("sonuc2 = " + s.Sub());
        s.setX(44);
        s.setY(10);
        System.out.println("sonuc3 = " + s.Add());
        System.out.println("sonuc4 = " + s.Sub());
        
        //s.x yada s.y yazamayız çünkü değişkenler private

        SimpleCalc1 e = new SimpleCalc1(2,3);
        System.out.println("sonuc5 = " + e.Add());
        System.out.println("sonuc6 = " + e.Sub());
        System.out.println("sonuc7 = " + e.Mult());
        System.out.println("sonuc8 = " + e.Div());
        e.setX(6);
        e.setY(5);
        System.out.println("sonuc9 = " + e.Mult());
        System.out.println("sonuc10 = " + e.Div());
        

    }
}
