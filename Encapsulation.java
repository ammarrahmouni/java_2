//Encapsulation (Kapsüllenme)

public class Encapsulation{
    public static void main(String[] args){
        Dikdortgen x = new Dikdortgen();
        Dikdortgen y = new Dikdortgen();

        x.setEn(1.4);
        x.setBoy(4.2);
        y.setEn(5.2);
        y.setBoy(3.3);

        System.out.println("X dikdortgen alani : " + x.DikdortgenAlani());
        System.out.println("Y dikdortgen alani : " + y.DikdortgenAlani());
        System.out.println("----------------------");
        System.out.println("X dikdortgenin eni : " + x.getEn());
        System.out.println("X dikdortgenin Boy : " + x.getBoy());
        System.out.println("Y dikdortgenin eni : " + y.getEn());
        System.out.println("Y dikdortgenin eboy : " + y.getBoy());

    }
}

class Dikdortgen{
    private double en;
    private double boy;

    public double getEn(){
        return en;
    }
    public void setEn(double en){
        this.en = en;
    } 
    public double getBoy(){
        return boy;
    }
    public void setBoy(double boy){
        this.boy = boy;
    }
    public double DikdortgenAlani(){
        return en * boy;
    }
}