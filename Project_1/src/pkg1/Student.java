package pkg1;

public class Student 
 {  
   int a;
   int b;
   public void dinesh1()
    {
    	System.out.println("First Method");
    }
   public void dinesh2()
    { 
	   System.out.println("Second Method");
	}
   public static void main(String[] args) 
    {
	   Student obj=new Student();
	   obj.a=5;
	   obj.dinesh1();
	   System.out.println(obj.a);
	   obj.b=56;
	   obj.dinesh2();
	   System.out.println(obj.b);
	  
    }  
 }
