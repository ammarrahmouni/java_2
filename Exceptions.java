import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

/**
 * Exceptions:Bu kelime ne demek?
 * Exception demek istisnayi hatadır Beklememek bir hatadır şimdi java dilinde 
 * Böyle Bir şay yaşamamız için Exception olşturmuşlar yani bu istisnayi hataları
 * Düzenlemek için Hatalarıa düşmemek için Koymuşlar.Örnek alalım düşüneyelim
 * bir program yazmışız ve o program kullanıcı internet ile bğlanmısı gerekiyor
 * Kullanıcı internet ile bağlınamdan programa giriş yapmış işte bu bir Exception
 * ve onu düzenlenmek için iki Block kullanacağız birisi adı (Try) Diğeri (catch).
 * Şüpheledim kodu Try kısmında Kodu koyuruz ve Eğer bu hata olursa onun çözümü
 * catch kısmına koyuruz.Şimdi program bakıyor Eğer istisna hata olması Try 
 * kısmındaki kodu çalıştırıyor catch kısmına girmeden sonra catch'tan sonra 
 * kodu devam ediyor.Lakin aksi halde Eğer bir hata olursa o zaman try kısmından
 * çik ce catch ile kodu devam et sonra catch'tan sonra kodu devam et.
 * Aşağıdaki örnek şüpheldim kodu ( x = scn.nextInt(), y = scn.nextInt();)
 * çünkü o satır kullanıcıdan bir tam sayi girmesini bekliyor kullanıcı
 * belki int bir değer girmese yani float double String girirse o zaman hata olur ve
 * program catch kouyu çalıştırır.
 * catch Birde daha fazla olştırabiliriz.şimdi catch kısmını (calss_name object name);
 * class_name kısmını o hatanın tipi yani yanlış inputlar girmek Vs
 * object_name Try'daki hatayı taşır eğer object_name yazdırırsak 
 * hatanın tipi yazdıracak.
 */
public class Exceptions{
    public static void main(String[] args){
        int x,y;
        Scanner scn = new Scanner(System.in);
        
        try{
            System.out.println("Welcome");
            System.out.println("Please Enter The First Number : ");
            x = scn.nextInt();
            System.out.println("Please Enter The Secund Number : ");
            y = scn.nextInt();
            System.out.println("Result1 = " + (x + y));
            System.out.println("Result2 = " + (x - y)); 
            System.out.println("Result3 = " + (x / y));
        }
        /**
         * şimdi burda (e) ne işi yarar?Try kısmında
         * Exception catch blocku e oject'i gönderir.
         * Yani (e) object try koddaki hatasını taşır.
         * (e) objecti yadırdığımız zaman Ekrana hatanın tipi
         * yazdırır.Bu ornek için hata InputMismatchException.
         * Şimdi birinci catch'ta sadece yanlış giren bilgiler ile
         * ilgilenir ve ikinci catch sadece 0'a Bölersek ilgilenir.
         * Ama Eğer sadec Exception yazarsak her hatayi ilgilenir.
         * Ama biz genellikle her catch'ı hangi hatayi ile ilgilenmesi
         * belirlemek lazım. 
         * Bazen boş bir catch kullanıyoruz bu demek ki bu hata olursa 
         * hiç bir şey yapma kodu catch'tan sonra devam et
         * şimde sadece Exception yazarsak o zmana bu bütün hatalerlı 
         * ilgilenir ama eğer (InputMismatchException) bu bir tip, öyle bir şey yazarsak 
         * o zaman belli bir hatayı incele.
         *  */  
        /**
         *  (InputMismatchException) bu yanlış bilgileri girmek gibi ilgilenir
         *  yani biz kullanıcıdan bir sayıyı girmesini beklereken o string tipinde
         * bir şeyler girmiş.
         * */     
        /**
         * Return : Burda return kelimesi kullanılırsak demek ki main metodudan çık
         * yani programı kapat.Ama bunda yazdığımız rağman finally blockuna girer
         * ve ordaki kodları çalştırır sonra programdan çıkar.
         * Dikkat edelim finally sonrası kodları çalıştırmaz tabi ki catch'ta return 
         * oluğu için  
         *  */ 
        catch(InputMismatchException e){
            System.out.println("Please make sure you enter a Integer number");
            //System.out.println(e); #=> java.util.InputMismatchException
            return;
        }
        /**
         * (ArithmeticException) bu metematik hataları ilgilenir
         * bir sayıyı 0'a bölmek gibi.
         */
        catch(ArithmeticException er){
            System.out.println("It may not be divided by 0");
            //System.out.println(er); #=>java.lang.ArithmeticException
            return ;
        }
        /**
         * Finally Ne işi yarar?
         * finally eğer Exception olursa ya da olmasa içindeki kodu çalışır.
         * Yani örnek eğer biz try block'unda bir dosya açtık o da Bellek'te 
         * bir yer tutmuş o zaman biz finally block'unda bu dosayayı kapatabiliriz.
         * En çok kullanılan bellekte temezlemek için kullanılır.
         */
        finally{
            System.out.println("Done.");
            
        }
        System.out.println("Exit the program");

    }
}