/**
 * Bir class içinde bir class ve bu yeni class o da içinde bir class 
 * tabi bu işlem istediğimiz kadar yapabiliriz.
 * üye sınıfın içersinde dahili üye sınıf tanımlayabilirsiniz Tanımlana bu 
 * dahili üye sınıfın içersinde , yeni bir dahil üye sınıf tanımlayabilirsiniz.
 */

class Abc{
    public Abc(){
        System.out.println("Abc nesne oluşturyoruz");
    }
    public class Def{
        public Def(){
            System.out.println("Def nesne oluşturyoruz");
        }
        public class Ghi{
            public Ghi(){
                System.out.println("Ghi nesne oluşturyoruz");
            }
        }//calss Ghi
    }//class Def
    public static void main(String[] args){
        Abc.Def.Ghi adg = new Abc().new Def().new Ghi();
    }
}//class Abc