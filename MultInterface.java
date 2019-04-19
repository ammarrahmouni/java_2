/**
 * Bir class Birden daha fazla interface implements yapılabilir
 * implements yaparken interface isimleri arasında virgüle koyarız.
 * artık bu implements olan class'i her interface içindeki
 * bütün metotlar override yapmak zorunda.
 * Eğer her interface aynı metot adı varsa hata vermez lakin
 * bunları override yaparken tek bir tane yapar.
 */
interface A{
    public void getDataA();
    public void printDataA();
}
interface B{
    public void getDataB();
    public void printDataB();
}
class AB implements A, B{
    public void getDataA(){
        System.out.println("This is getDataA() metod from class AB");
    }
    public void printDataA(){
        System.out.println("This is printDataA() metod from class AB");
    }
    public void getDataB(){
        System.out.println("This is getDataB() metod from class AB");
    }
    public void printDataB(){
        System.out.println("This is printDataB() metod from class AB");
    }
}
class First{
    public void startA(A a){
        a.getDataA();
        a.printDataA();
    }
    public void startB(B b){
        b.getDataB();
        b.printDataB();
    }
    public void startAB(AB ab){
        ab.getDataA();
        ab.printDataA();
        ab.getDataB();
        ab.printDataB();
    }
}
public class MultInterface{
    public static void main(String[] args){
        First f = new First();
        AB ab = new AB();
        f.startA(ab);
        System.out.println("-------------------");
        f.startB(ab);
        System.out.println("-------------------");
        f.startAB(ab);
    }
}