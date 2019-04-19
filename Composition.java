import java.util.*;
/**
 * Composition:Demek ki biz olşturduğumuz sınıf'ların nesnelerini Başka 
 * sınıflarda hem object hem de  Değişken olarak kullanılmaktadır.
 *  Biz yeni bir class oluşturuken zaten yeni bir tip olşturuyoruz
 * (int, float, .....)gibi tipler olşturuyoruz.
 * Bir sınıfta bir değişken kullanacaksak önce o değişkenin tipi
 * kouyoruz yani böyle(int x;)int aslında bir tiptir tam olarak 
 * class'ların adıları gibidir.Şimdi şöyle düşenyelim programda
 * Bir Scanner sınıfı varsa ve biz o sınıfın özellikleri (metorlar)
 *  başka sınıfta kaullanmak istiyorsak yeni bir değişken oluştırmamız gerek
 * ve bu değişkeni Scanner sınıfı bir object'tir.Önce class'ın adı sonra
 * değişkenin adı olştururuz(int x;) gib Böyle(Scanner değişken_adı;)
 * sonra değişken_adı = new Scanner();
 */
public class Composition{
    public static void main(String[] args){
        SimpleCalc s = new SimpleCalc();
        int result1 = s.add();
        int result2 = s.sub();
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        AutherCalc a = new AutherCalc();
        int result3 = a.add();
        int result4 = a.sub();
        int result5 = a.mul();
        int result6 = a.div();
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);
        System.out.println("result5 : " + result5);
        System.out.println("result6 : " + result6);

        
    }

}
class SimpleCalc{
    private int x;
    private int y;
    private Scanner scn; //Composition
   // private Scanner scn = new Scanner(System.in); aslında böyle de yapmak doğrudur.
    public SimpleCalc(){
        this.scn = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        this.x = scn.nextInt();
        System.out.println("Enter The Secund Number : ");
        this.y = scn.nextInt();
    }
    public final int add(){
        return this.x + this.y;
    } 
    public final int sub(){
        return this.x - this.y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
class AutherCalc extends SimpleCalc{
    public AutherCalc(){
        super();
    }
    public final int mul(){
        return this.getX() * this.getY();
    }
    public final int div(){
        if(getY() == 0)
        {
            System.out.println("Y degeri 0 olamaz!");
            return 0;
        }
        return this.getX() / this.getY();
    }
}