/**
 * Empty interface : Biz istersek boş bir interface oluştyrabiliriz yani hiç bir şey yok.
 * Bu ne işi yarar??
 * Böylece biz her class o inetrfaceyi implements yaparsa o class'lardan objectler 
 * parametre olarak gönderebiliriz ardığıdan istediğimiz işlemelr yapabiliriz.
 */
interface App4{

}

class A implements App4{
    public void set(){
        System.out.println("This is set method from class A");
    }
}
class B implements App4{
    public void set(){
        System.out.println("This is set method from class B");
    }
}
class Topla{
    public static void get(App4 a){
        if(a instanceof A){
            A obj = (A)a;
            obj.set();
        }
        else if(a instanceof B){
            B obj = (B)a;
            obj.set();
        }

    }
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        get(a);
        get(b);
    }
}