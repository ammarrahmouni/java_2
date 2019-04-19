/**
 * dahili üye sınıflara public, frindly, protected veya private eişim belirleyicileri 
 * atanbilir, böylece dahili üye sınıflarımıza olan erişimi kısıtlamış/açmış (قيود) oluruz
 * Dikkat edilmesi gereken diğer bir hususs ise bir dahil üye sınıf private erişim belirleyicisine
 * sahip olsa dahi çevreleyici sınıf (outer class) içersindeki tüm yordamları tarfından erişilebilir
 * olmasıdır.Bu kısıt ancak başka sınıflar için geçerlidir.
 * lakin o private erişimi sadece eğer outer calss yordamlarında erişilebilir.
 * eğer başak class'larından erişiemeyiz. 
 */
public class NestedClass1{
    public class Toplama{ //Dahil üye sınıf -public-
        
        public int toplamaYap(int a, int b){
            return a + b;
        }
    }//class Toplama
    protected class Cikarma{ //Dahil üye sınıf -protected-
        public int cikarmaYap(int a, int b){
            return a - b;
        }
    }//class Cikarma
    class Carpma{ //Dahil üye sınıf -friendly- 
        public int carpmaYap(int a , int b){
            return a * b;
        }
    }//class Carpma
    private class Bolme{ //Dahil üye sınıf -private-
        public double bolmeYap(int a, int b){
            if(b == 0)
            {
                System.out.println("Erorr 0'bir bolme yapılmaz");
                return 0;
            }
            else 
                return a / b;

        }
    }//class Carpma

    public static void main(String[] args){
        NestedClass1.Toplama nt = new NestedClass1().new Toplama();
        NestedClass1.Cikarma nc = new NestedClass1().new Cikarma();
        NestedClass1.Carpma  na = new NestedClass1().new Carpma();
        NestedClass1.Bolme   nb = new NestedClass1().new Bolme();
        int sonuc1 = nt.toplamaYap(4,5);
        int sonuc2 = nc.cikarmaYap(4,5);
        int sonuc3 = na.carpmaYap(4,5);
        double sonuc4 = nb.bolmeYap(4,5);
        System.out.println("Toplama sonuc = " + sonuc1);
        System.out.println("Cikarma sonuc = " + sonuc2);
        System.out.println("Carpma sonuc = " + sonuc3);
        System.out.println("Bolme sonuc = " + sonuc4);
        /**
         * Not : Eğer biz main metodu başka bir class'inda kullanarak ve Bolme class'i çağırmak istiyorsak 
         * çağıramayız çünkü onun tipi private.Ancak outer class içinde istediğimiz yerden çağırabiliriz.
         */
    }
}
