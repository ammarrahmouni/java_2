class Hayvan {
    public void avYakala(){
        System.out.println("Hayvan avYakala");
    }
}
class Kartal extends Hayvan{
    @Override
    public void avYakala(){
        System.out.println("Kartal avYakala");
    }
}
class Timsah extends Hayvan{
    @Override
    public void avYakala(){
        System.out.println("Timsah avYakala");
    }
}
public class PolymorphismOrnekIki{

    /* Bu metodun tipi Hayvan (bir object dödürmesi gerek) 
    * ve o object hayvan tipinden olmalı ya da Hayvan türetilden calss'lardan olmalıdır !Dikkat! 
    */
    public static Hayvan rastgeleSec(){
        int sec = ( (int) (Math.random() * 3) );
        Hayvan h = null;
        if(sec == 0) h = new Hayvan();
        if(sec == 1) h = new Kartal();
        if(sec == 2) h = new Timsah();
        return h;
    }
    public static void main(String[] args){
        Hayvan [] e = new Hayvan[3];
        //dizi doldur
        for(int i = 0; i < 3; i++)
        {
            // dizinin elemanlar sadece ve sadece object olmalıdr 
            //ya Hayvan calss'ından ya o calss'ından türetilen calss'lar
            e[i] = rastgeleSec(); // upcasting
        }  
        // dizi elemanları ekrana bas
        for(int i = 0; i < 3; i++)
        {
            e[i].avYakala(); //Dikkat
        }
        // rastgele bir object yazdıracak.
        System.out.println(rastgeleSec());
    }
}
/**
 * dizi içersindeki elemanlar ancak çalışma anında (run-time) blli oluyorlar
 * h[i].avYakal() derken derleme anında(compile-time) hangi nesnenin avYakala()
 * çağırlacağını java tarfından bilinmez , bu olay ancak çalışma anında (run-time) bilinebilir.
 * Geç bağlama özelliği bu noktada karşımıza çıkar.Geç bağlamanın (late-binding) diğer isimleri
 * dinamik bağlama(dyanmic-binding) veya çalışma anında bağlamadır (runtime-binding).
 */

/**
 * Not: Final Kullanımın iki sebebi vardır: tasarım ve verimlilik(الكقاءة)
 * Bir yordamı Fianl yaparak şunu demiş oluruz bu yordam, türetilmiş olan alt sınıfları içerisindeki
 * diğer yordamlar  tarafından iptal edilemesin (override) yapamasın Eğer bir yordam iptal edilemezse
 * o zaman geç bağlama (late-binding) özelliği de ortadan kalkar , böylece verimlilik artar
 * 
 * Uygulama içersinde herhangi bir nesneye ait normal bir yordam (finla olmayan) çağrıldğında ,
 * java, acaba doğru nesnenin uygun yordamı mı çağırılıyor diye bir kontrol yapar, daha doğrusu 
 * geç bağlamaya (late-binding) ihtiyaç var mı kontrolu yapılır.Bu kontrol de verimliliği düşüren bir durumdur   
 */