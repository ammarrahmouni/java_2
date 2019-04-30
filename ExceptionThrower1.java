// Not : Bu kod dektop üzerinde çalıştır burd çalışmaz.

import javax.swing.JOptionPane;

class testextends{
    
    public static void main(String[] args) {
        double pay = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        double payda = Integer.parseInt(JOptionPane.showInputDialog("Enter the secund number"));

        if(payda <= 0){
            throw new IllegalArgumentException("The number is not pozitif");
        }

        System.out.println(pay / payda);
    }
    /**
     * IllegalArgumentException runtime çalışacağı için onu try kısmına istersek koyup 
     * istersek koymayabiliriz.
     */
}

class IstisnaMesajlar{
    public static void oku() throws Exception{
        throw new Exception("Erorr");
    }

    public static void main(String[] args) {
        try{
            oku();
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}

class testextends2 extends RuntimeException{
    public testextends2(String a){
        super(a);
    }
        public static void main(String[] args) {
            try{
                double pay = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
                double payda = Integer.parseInt(JOptionPane.showInputDialog("Enter the secund number"));
        
                if(payda <= 0){
                    throw new testextends2("The number is not pozitif");
                }
        
                System.out.println(pay / payda);
            }catch(testextends2 e){
                System.out.println(e.getMessage());
            }

        }
   
}