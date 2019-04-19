package access;

    /*  
        javada bir paket oluştırmak için yazılmalı kod:
        javac -d . classname.java
        java packagename.classname
        Not:Burda en doğru değerlendirme önce object1 calss değerlendirmek 
        sonra AccessModPrivat değerlendirilir.
    */

public class AccessModPrivate{
    public static void main(String[] args){
        object1 aces = new object1(4);
        //  aces.x = 10;  Hata!-çünkü x değişkeni private bir değişkendir sadece kendi classinda erişebilir.

        // Private olan değişkenler ereşebilmek için bir yöntemdir.
        aces.setx(400);
        int y = aces.getx();
        System.out.println(y);
        
        

    }
}