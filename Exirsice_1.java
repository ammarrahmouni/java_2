import java.util.Scanner;

public class Exirsice1{
    public static void main(String[] args){
        Scanner reed = new Scanner(System.in);
        String text, text1;
        int enter, devam;
        int enter1;
        int x;
        int u;
        int sum;
        char c;
        System.out.println("Welcome");
        System.out.println("This program calculates the text characters you enter but The spaces and punctuation marks do not count!");
        while(true)
        {
            System.out.println("To enter, press 1. To exit, press 2:");
            enter =  reed.nextInt();
            if(enter == 1)
            {
                
                System.out.println("Plese Enter The Text:");
                reed.nextLine();
                text1 = reed.nextLine(); 
                x = text1.length();
                u = 1;
                for(int i = 0; i < x; i++)
                {
                    c = text1.charAt(i);
                    if(c != ' ' && c != '!' && c != '.' && c != ',' && c !=':' && c != ';' && c != '?')
                    {
                        System.out.println(u + "." + c);
                        u++;
                    }
                }
                sum = u - 1;
                System.out.println("The total number of text characters is: " + sum + " characters");
                System.out.println("if Do you want to continue plese press 1 and if do you wante to exit please press 2:");
                devam = reed.nextInt();
                if(devam == 1)
                {
                    continue;
                }
                else if(devam == 2)
                {
                    System.out.println("Thank you MS!");
                    break;
                }
                else
                {
                    System.out.println("Please check the number entered and try again!");
                    break;
                }

            }
            else if(enter == 2)
            {
                System.out.println("Bye Bye");
                break;
            }
            else
            {
                System.out.println("Please check the number entered and try again!");
                
            }
            
        }
    }
}