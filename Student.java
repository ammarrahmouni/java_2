/**
 * class Student Information
*/
public class Student{
    /* Student ID */
    private int id;
    /* Student Name */
    private String name;
    /* Student Age */
    private int age;
    /* Student GPA */
    private float gpa;
    /* Student Department for university */
    private String department;
    /**
     * Initialization Student Data
     */
    public Student()
    {
        this.id  = 0;
        this.name = "None";
        this.age = 0;
        this.gpa = 0.0f;
        this.department = "None";
    }
    /**
     * Initialization Student Data
     * name : Student name
     */
    public Student(String name)
    {
        this.id  = 0;
        this.name = name;
        this.age = 0;
        this.gpa = 0.0f;
        this.department = "None";
    }
    /**
     * Initialization Student Data
     * id = Student ID
     */
    public Student(int id)
    {
        this.id  = id;
        this.name = "None";
        this.age = 0;
        this.gpa = 0.0f;
        this.department = "None";
    }
    /**
     * Initialization Student Data
     * id : Student ID
     * name : Student name
     * age : Student age
     * gpa : Student GPA
     * department : Student department
     */
    public Student(int id , String name , int age , float gpa , String department)
    {
        this.id =  id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.department = department;
    }
    /**
     * setId : In order to give value to the private variable id
     * id : Student ID
     */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
     * getId : In order to use the privat variable id
     */
    public int getId()
    {
        return this.id;
    }
    /**
     * setName : In order to give value to the private variable name
     * name : Student name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * getName : In order to use the privat variable name
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * setAge : In order to give value to the private variable age
     * age : Student age
     */
    public void setAge(int age)
    {
        this.age = age;
    }
    /**
     * getAge : In order to use the privat variable age
     */
    public int getAge()
    {
        return this.age;
    }
    /**
     * setGpa : In order to give value to the private variable gpa
     * gpa : Student gpa
     */
    public void setGpa(float gpa)
    {
        this.gpa = gpa;
    }
    /**
     * getGpa : In order to use the privat variable gpa
     */
    public float getGpa()
    {
        return this.gpa;
    }
    /**
     * setDepartment : In order to give value to the private variable department
     * department : Student department
     */
    public void setDepartment(String department)
    {
        this.department = department;
    }
    /**
     * getDepartment : In order to use the privat variable department
     */
    public String getDepartment()
    {
        return this.department;
    }
    /**
     * Print Student Information
     */
    public void printStudentInfo()
    {
        assert this.name != "None" : " Erorr: Name is None";
        assert this.id > 0 : this.name + " Erorr: ID is zero";
        assert this.age > 0 : this.name + " Erorr: age is zero ";
        assert this.department != "None" : this.name + " Erorr: department is None";

        System.out.println("-------------" + this.name + " Informatiom" + "----------------");
        System.out.println("Student's name : " + this.name);
        System.out.println("Student's Number : " + this.id);
        System.out.println("Student's age : " + this.age);
        System.out.println("Student's department : " + this.department);
        System.out.println("Student's GPA : " + this.gpa);
    }

}