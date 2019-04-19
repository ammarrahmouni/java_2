//assert kelimesi;
/**
 * Assert:Demek ki bir ifadeyi doğru olup olamdığını incelenmektedir
 * assert bunun için kullanılır (logic ifadeler) eğer sonuç true ise
 * programı devam et yanlışse programı durdur ve hata ver.
 * assert etkinleştirmek için programı değerlendikten sonra 
 * (java -ea class_adı)bu 
 */
public class Assertion{
    public static void main(String[] args){
        int x = 100;
        int y = 10;
        assert x > y: "x big than y"; //hata olmadığı müdetçe o messageyı vermez.
        System.out.println("Done");
        assert ((x <= 100) && (y <= 10)):"x less than 100 and y less than 10";
        System.out.println("Done");
        assert y > x: "y less than x";  //bu hatayı olduğunda o messageyı verir.
       System.out.println("Done");
    }
}