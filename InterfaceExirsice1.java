//Interface 

interface Calisan{
    public void calis();
}
class Mudur implements Calisan{
    //override yapmak zorunda 
    public void calis(){
        System.out.println("Mudur calisiyor");
    }
}
class GenelMudur extends Mudur{
    //override yapmak zorunda değil
    public void calis(){
        System.out.println("GenelMudur calisiyor");
    }
    public void toplamtiYonet(){
        System.out.println("Genel mudur topalnti yonetiyor");
    }
}
class Programci implements Calisan{
    //override yapmak zorunda 
    public void calis(){
        System.out.println("Programci calisiyor");
    }
}
class AnalizProgramci extends Programci{
    public void analizYap(){
        System.out.println("Analiz yapiliyor");
    }
}
class SistemProgramci extends Programci{
    public void sistemIncele(){
        System.out.println("Sistem Inceleniyor");
    }
}
class Pazarlamaci implements Calisan{
    //override yapmak zorunda 
    public void calis(){
        System.out.println("Pazarlamaci calisiyor");
    }
}
class Sekerter implements Calisan{
    //override yapmak zorunda 
    public void calis(){
        System.out.println("Sekerter calisiyor");
    }
}
class InterfaceExirsice1{
    public static void mainBasl(Calisan[] c){
        for(int i = 0; i < c.length; i++)
        {
            c[i].calis(); //Dikkat
        }
    }
    public static void main(String[] args){
        Calisan[] c = new Calisan[7];
        //c[0] = new Calisan Hata Arayüz oluşturamayız
        c[0] = new Programci();
        c[1] = new Pazarlamaci();
        c[2] = new Sekerter();
        c[3] = new SistemProgramci();
        c[4] = new AnalizProgramci();
        c[5] = new Mudur();
        c[6] = new GenelMudur();
        mainBasl(c);
    }
}
/* * Bubnu aynısı soyut sınıflar (abstract class) zaten yapiliyordu 
   * arayüzleri neden kullanayım ki diyebilirsiniz.Bu örnekte arayüzlerin
   * nasıl kullandığını incelenmiştir.
  /