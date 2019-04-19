package programs;

import java.util.*;
import java.text.*;
import java.util.InputMismatchException;

public class Login{
    private String username;
    private String password;
    private int yearBrith;
    private int mountBrith;
    private int dayBrith;
    private int ageYear;
    private int ageMounth;
    private int ageDay;
    private int operate;
    private String text;
    private char alpha; 
    private int toplam;
    private String operate2; 

    Scanner read = new Scanner(System.in);
    Date date = new Date();
    SimpleDateFormat sy = new SimpleDateFormat("yyyy");
    SimpleDateFormat sm = new SimpleDateFormat("MM");
    SimpleDateFormat sd = new SimpleDateFormat("dd");

    public Login(){ //Constructor method
        username = "None";
        password = "None"; 
        yearBrith = 0;
        ageYear = 0;
        operate = 0;
        text = "None";
        alpha = ' ';
        toplam = 0;
        System.out.println("Welcome");
    }//Constructor method

    /* getter methodu for username varaible */
    public String getUser(){ //getUser method
        return username;
    }//getUser method

    /* getter methodu for password varaible */
    public String getPas(){ //getPas method
        return password;
    }//getPas method

    /* getter methodu for ageYear varaible */
    public int getAge(){  //getAge method
        return ageYear;
        
    } //getAge method

    /* This method allows the user to enter his data */
    public void input(){ //input method
        System.out.println("Please Enter Your username: ");
        username = read.nextLine();
        System.out.println("Please Enter Your passwords: ");
        password = read.nextLine();
    }//input method

    /* This method shows user data */
    public void output(){ //output method
        if(assertFromInfo()){
            System.out.println("username and password is correct.");
            System.out.println("--------------------------------");
            System.out.println("User Info:");
            System.out.println("username is: " + username);
            System.out.println("password is: " + password);
        }
    }//output method

    /* The method check up user data */
    public Boolean assertFromInfo(){ //assertFromInfo method
        //Burda Dikkat String olan username değişkeni equals fonk çağırırken yaptık (==) ile olamaz.
        //Bu sadece String tibi değişkenler de olur.
        if(username.equals("ammar") && password.equals("05366394454"))
            return true;
        else
            return false;
    }//assertFromInfo method

    /* This method allows the user to access his account */
    public void loginSystem(){ //loginSystem method
        try{
            if(assertFromInfo()){
                System.out.println("--------------Welcome in your account------------");
                System.out.println("Please specify the number for the operation you wish to perform: ");
                System.out.println("1- Apply Age Account");
                System.out.println("2- Applying the calculation of imported text characters");
                System.out.println("3- Exit form program");
                operate = read.nextInt();
                if(operate == 1)
                    ageAccount(); //Burda Dikkat ageAccount methodu try Block'un içinde olduğu için artık o metodu içinde eğer bir exception olursa burdaki catch kısımına düzenlenir, yani ageAccount metodunda try ve catch blokları yazmayı gerek yoktur eğer ordaki hatayi aynı şekilde düzenleyacaksek.
                else if(operate == 2)
                    charactersAccount();
                else if(operate == 3)
                    exitFromProgram();
                else
                    System.out.println("Please make sure you enter correct information and try again.");  
                    loginSystem();
            }
            else 
                System.out.println("Please make sure your username and password are correct and try again later.");
                input();
                loginSystem();
        }
        catch (InputMismatchException e) {
            System.out.println("Please make sure you enter correct information and try again later.");
            exitFromProgram();
        }

    }//loginSystem method

    /* This method calculates the user's age*/
    public void ageAccount() { //ageAccount method 
        try{
            System.out.println("Please Enter Your Brith Year:");
            yearBrith = read.nextInt();
            System.out.println("Please Enter Your Brith Mounth:");
            mountBrith = read.nextInt();
            System.out.println("Please Enter Your Brith Day:");
            dayBrith = read.nextInt();
            ageYear = Integer.valueOf(sy.format(date)) - yearBrith;
            ageMounth = Integer.valueOf(sm.format(date)) - mountBrith;
            ageDay = Integer.valueOf(sd.format(date)) - dayBrith;
        }
        catch (InputMismatchException e) {
            System.out.println("Please make sure you enter correct information and try again later.");
            exitFromProgram();
        }

        if(yearBrith > Integer.valueOf(sy.format(date)) || mountBrith > 12 || dayBrith > 31){
            System.out.println("Erorr! Make sure that the number of the month you entered is not greater than 12 and that the day number you entered is not greater than 31 and that the year number you entered is not greater than current year and try again.");
            ageAccount();
        }
        else if(yearBrith >= Integer.valueOf(sy.format(date)) && mountBrith > Integer.valueOf(sm.format(date))){
            System.out.println("Erorr! Your date of birth can not be greater than the current date");
            System.out.println("Please try agin, and make sure your brith date Younger than the current date");
            ageAccount();
        }
        else if(yearBrith >= Integer.valueOf(sy.format(date)) && mountBrith >= Integer.valueOf(sm.format(date)) && dayBrith > Integer.valueOf(sd.format(date))){
            System.out.println("Erorr! Your date of birth can not be greater than the current date");
            System.out.println("Please try agin, and make sure your brith date Younger than the current date");
            ageAccount();
        }
        else{
            if(ageDay < 0 && ageMounth < 0){
                ageMounth -= 1;
                ageMounth += 12;
                ageDay += 30;
                ageYear -= 1;
            }
            else if(ageDay == 0 && ageMounth < 0){
                ageYear -= 1;
                ageMounth += 12;
            }
            else if(ageDay < 0 && ageMounth > 0){
                ageDay += 30;
                ageMounth -= 1;
            }
            else if(ageDay < 0 && ageMounth == 0){
                ageMounth -= 1;
                ageMounth += 12;
                ageDay += 30;
                ageYear -= 1;
            }
            else if(ageDay > 0 && ageMounth < 0){
                ageMounth += 12;
                ageYear -= 1;
            }
            else if(ageDay == 0 && ageMounth == 0){
                System.out.println("Today is your Brith day!");
            }
        }
        System.out.println("Your age by year is : " + ageYear + " Year and " + ageMounth + " mounth and " + ageDay + " day");
        System.out.println("Stay for your birthday : " + brithDay() + " Day");
        System.out.println("Your age by mounth is : " + ageByMounth());
        System.out.println("Your age by day is : " + ageByDay());
        mainMenu();
    }//ageAccount method

    /* This methodu calculates the user's age by mounth */
    public int ageByMounth(){ //ageByMounth method
        return (ageYear * 12 + ageMounth);
    }//ageByMounth method

    /* This methodu calculates the user's age by day */
    public int ageByDay(){ //ageByDay method
        return (ageYear * 365 + ageMounth * 30 + ageDay);
    }//ageByDay method

    /* This method calculates how many day stay for user brith day*/
    public int brithDay(){ //brithDay method
        ageMounth = 11 - ageMounth;
        ageDay = 30 - ageDay;
        return (ageMounth * 30 + ageDay);
    }//brithDay method

    /* This method calculates the number of characters entered */
    public void charactersAccount(){ //charactersAccount method
        int num = 1;
        // public,protected,private int a = 4; Hata metodun içinde değişkenler tipi defualt olmalıdır.
        String operate2;   
        System.out.println("Please enter the text:");
        read.nextLine(); //Bu bir stıra inmesi için kullanıyoruz.
        text = read.nextLine();
        for(int i = 0; i < text.length(); i++){
            alpha = text.charAt(i);
            if(alpha != ' ' && alpha != ',' && alpha != ':' && alpha != '.' && alpha != '!' && alpha != '/' && alpha != '?')
            {
                System.out.println(num + "." + alpha);
                num++;
            }
        }
        toplam = num - 1;
        System.out.println("The total number of text characters is: " + toplam + " characters.");
        mainMenu();
    } //charactersAccount method

    /* This method closes the program */
    public void exitFromProgram(){ //eixtFromProgram method
        System.out.println("Thank You!");
        System.exit(-1);
    }//eixtFromProgram method

    /* This method allows the user to return to the main menu or shutdown the program */
    public void mainMenu(){ //mainMenu method
        System.out.println("If you want to go back to the main menu please press the return button and if you want to exit press the exit button:");
        operate2 = read.next();
        if(operate2.equals("return") || operate2.equals("Return"))
            loginSystem();
        else if(operate2.equals("exit") || operate2.equals("Exit"))
            exitFromProgram();
        else
            System.out.println("Please make sure you enter correct information and try again later.");  
            mainMenu();
    }//mainMenu method

}//class Login