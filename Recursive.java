/**
 * Recursive metodu demek ki bir metodu içinde kendini çağırılması
 * lakind dikkat etmemiz gerek o bir loop gibi olduğu ve belli bir koşulda 
 * durması gerek, yoksa hata verir sonsuza gider.
 */

public class Recursive{
    public void rec(double x){
        if (x > 0)
            rec(x / 2); // Recursive
        System.out.println(x);
    }
    public void draw(int x){
        if (x == 0)
            return ;
        for(int i = 0; i < x; i++){
            System.out.print("@");
        }
        System.out.println("$");
        draw(x - 1); // Recursive
        System.out.println("The end " + x);
    }
    public static void main(String[] args){
        Recursive r = new Recursive();
       // r.rec(50);
        r.draw(8);
    }
}