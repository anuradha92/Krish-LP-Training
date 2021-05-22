class Student
{
    // Make a static data member of instance
    private static volatile Student instance;
    
    //private constructor to avoid client applications to use constructor
    private Student()
    {}
        
    // A public static method that returns instance 
    public static Student getInstance()
    { 
        if(instance == null)
        {
            synchronized(Student.class)
            {
                if(instance == null)
                    instance = new Student();
            }
        }
        return instance;
    }
}

public class StudentRecord
{
    public static void main(String arg[])
    {
        // Getting a object from singleton class
        Student stu1 = Student.getInstance();
        
        // Getting a object from singleton class
        Student stu2 = Student.getInstance();
        
        System.out.println("Both object are same: "+ (stu1 == stu2));
    }
}