/**
 * Not: metodlar adıları isimlendirmek için 3 tip vardır:
 * 1- C style : set_name();
 * 2- Pascal style : SetName();
 * 3- Camel style : setName();
 * istediğini seçilebiririz.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exirsice3{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Student ammar = new Student();
        Student ahmad = new Student("ahmad");
        Student amro = new Student(16578945);
        Student abdo = new Student(16061577, "abod", 25, 3.4f, "Doktor");
        Student std1 = new Student();

        ammar.setName("Ammar");
        ammar.setAge(22);
        ammar.setGpa(3.8f);
        ammar.setId(16061577);
        ammar.setDepartment("Computer Engineer");
        ahmad.setId(7984564);
        ahmad.setAge(24);
        ahmad.setGpa(2.0f);
        ahmad.setDepartment("Computer Seince");
        amro.setName("Amro");
        amro.setAge(20);
        amro.setDepartment("Elctrical Engineer");
        amro.setGpa(3.0f);
        ammar.printStudentInfo();
        ahmad.printStudentInfo();
        amro.printStudentInfo();
        abdo.printStudentInfo();
        System.out.println("-------------------");

        try {
            System.out.println("Please Enter Student Name : ");
            std1.setName(read.next());
            System.out.println("Please Enter Student ID : ");
            std1.setId(read.nextInt());
            System.out.println("Please Enter Studen Age : ");
            std1.setAge(read.nextInt());
            System.out.println("Please Enter Student Department : ");
            std1.setDepartment(read.next());
            System.out.println("Please Enter Student GPA : ");
            std1.setGpa(read.nextFloat());
            std1.printStudentInfo();
        } 
        catch (InputMismatchException e) {
            System.out.println("Input Mismatch");
        }
        System.out.println("Done");
        

    }
}
