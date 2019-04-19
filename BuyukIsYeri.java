//Genişletilebilirlik (Extensibinty)
class Calisan{
    public String pozisyon;
    public void calis(){

    }
}
class Mudur extends Calisan{
    public Mudur(){ // Yapılandırıcı
        pozisyon = "Mudur"; 
    }
    @Override   
    public void calis(){  //Override
        System.out.println("Mudur Calisiyor");
    }
}
class GenelMudur extends Mudur{
    public GenelMudur(){    //Yapılandırıcı
        pozisyon = "GenelMudur";
    }
    @Override
    public void calis(){ //(Override)
        System.out.println("Genel Mudur Calisiyor");
    }
    public void toplantiYap(){
        System.out.println("Genel Mudur toplanti yapiyor");
    }
}
class Programci extends Calisan{
    public Programci(){ // Yapılandırıcı
        pozisyon = "Programci";
    }
    @Override
    public void calis(){    //(Override)
        System.out.println("Programci calisiyor");
    }
}
class AnalizProgramci extends Programci{
    public AnalizProgramci(){   // Yapılandırıcı
        pozisyon = "AnalizProgramci";
    }
    public void analizYap(){
        System.out.println("Analiz Yapiliyor");
    }
}
class SistemProgramci extends Programci{
    public SistemProgramci(){   // Yapılandırıcı
        pozisyon = "SistemProgramci";
    }
    public void sistemIncele(){
        System.out.println("Sistem Inceleniyor");
    }
}
class Pazarlamaci extends Calisan{
    public Pazarlamaci(){   // Yapılandırıcı
        pozisyon = "Pazarlamaci";
    }
    @Override
    public void calis(){    //(Override)
        System.out.println("Pazarlamaci calisyior");
    }
}
class Sekrater extends Calisan{
    public Sekrater(){  // Yapılandırıcı
        pozisyon = "Sekrater";
    }
    @Override
    public void calis(){    //(Override)
        System.out.println("Sekrater calisiyor");
    }
}
public class BuyukIsYeri{
    public static void mainBasla(Calisan [] c){ //Dizinin değerleri yazdırmaktadır
        for(int i = 0; i < c.length; i++)
        {
            c[i].calis(); //Dikkat!
        }
    }
    public static void main(String[] args){
        Calisan[] c = new Calisan[8];
        c[0] = new Calisan();
        c[1] = new Programci();
        c[2] = new Pazarlamaci();
        c[3] = new Mudur();
        c[4] = new GenelMudur();
        c[5] = new Sekrater();
        c[6] = new AnalizProgramci();
        c[7] = new SistemProgramci();
        mainBasla(c);
    } 
}