//Enumoration (enum)
/**
 * enum : bu kavram ne demek? bu kavram demek ki sayici yani ellimizde sabit 
 * şeylar varsa enum içinde koyabliriz.Beki ne gibi bu sabitler: hafata'nin günleri
 * ay'ın adıları cinis adı erkerk ya da kadın.Böyle şeyler biz o enum içinde kouabiliriz
 * ardığında class'inda çağırabiliriz.o Sabitler arasında virgüle koyarız ve en son sabit 
 * noktalı virgül koyarız.
 * 
 * Kural-1 : Biz bu sabitler istersek değerler gönderebiliriz (parametre olarak)
 * lakin dikkat edeceğiz bir sabiti iki tane int parametre değerei gönderdiğimizi
 * döşünelim artık her değişkeni aynı tip ve aynı parametre sayıyı göndermek zorundayız.
 * Yani bu ornek için her değişken iki int parametre gönderiyoruz.
 * o enum için bir constructor metodu oluşturmak zorundayız.
 * o constructor metodu ordaki sabitler'in parametrelerin sayıları ve tipileri
 * o metodu aynı şekilde parametre almak zorunda. 
 * Bu metot'un erişim tipi private olmak zorunda.
 * enum class içinde yazılabilir ve tam aynı yaptığımız şeylaer orda da yapabiliriz.
 * sadece o sabitler çağırıken (class_adı.enum_adı.sabit_adı) bölye çağırız.
 * 
 * Kural-2 : Biz o enum içinde her bir sabit tanımlarsak sanki o class'tan bir oject yarattık gibi işlem yaptık.
 * Ardğında o object(yani o sabit) o enum içindeki değşkenler ve metotlar artık sahib oldu.
 * Tabi bu enum içinde istediğimiz metotlar ve değişkenler oluşturabiliriz.
 * 
 * Kurla-3 : enum içinde abstract metotlar içerilebilir.lakin dikkat edelim 
 * Eğer enum içinde abstract metotlar tanımlarsak o zaman her sabit için o metotu 
 * override yapmak zorundayız.
 * 
 * kural-4 : enum switch ile kullanabiliriz.
 * 
 * Kural-5 : Biz bir enum oluşturduğumzda java compile otomatik olarak bir Array oluşturyor
 * ve o Array içinde sırsaıyla  tanımladığımız sabitler.Bu Array adı values.
 * 
 * Kural-6 : valueOf("") o metod String tipi bir parametre alıyor biz ona Sabit'in adı 
 * o parametrenin içinde yazabiliriz.ardığında o  metot o sabit alıp ve istediğimiz işlem yapabilriz. 
 * 
 * Kural-7 : enum bir interface implemetns yapabilir ve class'ta olduuğu gibi
 * interface'in içindeki tüm metotlar override yapmak zorunda 
 */
interface App{
    public void test();
}
interface App2{
    public void getApp();
}
enum WeekDays implements App, App2{
    Monday(2, "Pazartesi"),
    Tuesday(3, "Sali"),
    Wednesday(4, "Carsamba"),
    Thursday(5, "Persembe"),
    Friday(6, "Cuma"),
    Saturday(7, "Cumartesi"),
    Sunday(8, "Pazar");
    
    public int dayNumb;
    public String dayName;

    private WeekDays(int dayNumb, String dayName) {//Constructor method
        this.dayNumb = dayNumb;
        this.dayName = dayName;
    }//Constructor method

    public void printDate(){
        System.out.println("This is Week Days enum.");
    }
    public void test(){
        System.out.println("This is test(); metod");
    }
    public void getApp(){
        System.out.println("This is getApp(); metod");
    }
}
enum MounthNames{
    January{
        public void get(){
            System.out.println("January");
        }
    },
    February{
        public void get(){
            System.out.println("February");
        }
    },
    March{
        public void get(){
            System.out.println("March");
        }
    },
    April{
        public void get(){
            System.out.println("April");
        }
    },
    May{
        public void get(){
            System.out.println("May");
        }
    },
    June{
        public void get(){
            System.out.println("June");
        }
    },
    July{
        public void get(){
            System.out.println("July");
        }
    },
    August{
        public void get(){
            System.out.println("August");
        }
    },
    September{
        public void get(){
            System.out.println("September");
        }
    },
    October{
        public void get(){
            System.out.println("October");
        }
    },
    November{
        public void get(){
            System.out.println("November");
        }
    },
    December{
        public void get(){
            System.out.println("December");
        }
    };

    public void printDate(){
        System.out.println("This is Mounth Names enum");
    }

    public abstract void get();
}
public class Enumoration{
    public static void main(String[] args) {
        for(WeekDays w : WeekDays.values()){
            System.out.println(w.dayName);
        }
        System.out.println("-----------------------");
        WeekDays.Monday.printDate();
        System.out.println("-----------------------");
        for(MounthNames m : MounthNames.values()){
            System.out.println(m);
        }
        System.out.println("-----------------------");
        MounthNames.December.printDate(); //public normal metot
        System.out.println("-----------------------");
        MounthNames.December.get(); //abstract metot
        System.out.println("-----------------------");
        WeekDays w = WeekDays.valueOf("Tuesday");
        System.out.println(w.dayName);
        System.out.println("-----------------------");
        MounthNames m = MounthNames.November;
        switch(m)
        {
            case January:
                System.out.println("January");
                break;
            case February:
                System.out.println("February");
                break;
            case March:
                System.out.println("March");
                break;
            case April:
                System.out.println("April");
                break;
            case May:
                System.out.println("May");
                break;
            case June:
                System.out.println("June");
                break;
            case July:
                System.out.println("July");
                break;
            case September:
                System.out.println("September");
                break;
            case October:
                System.out.println("October");
                break;
            case November:
                System.out.println("November");
                break;
            case December:
                System.out.println("December");
                break;
            default :
                System.out.println("Erorr!");
                break;
        }

    }
}