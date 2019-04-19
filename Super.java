public class Super{
    public static void main(String[] args){
        Type t = new Type();
        Info i = new Info();
        t.printB();
        System.out.println("------------------");
        i.printC();
    }   
}
class Attribute{
    public void printA(){
        System.out.println("This is class Attribute");
        
    }
}
class Type extends Attribute{
    public void printB(){
        super.printA();  //super: türetilinden sınıfı için ordaki fonk çağır.super this gibi sayılabilir.
        //Ama burda super kullanmayabilirdik zaten onun önemli işi burda değilidir
        System.out.println("This is class Type");
        
    }
}
class Info extends Type{
    public void printC(){
        super.printA();
        System.out.println("This is class Info");
        
    }
}