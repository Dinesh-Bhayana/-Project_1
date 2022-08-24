package pkg1;

public class abc 
 {
   public abc()
   {
	   this(10,20,30,40);
	   System.out.println("default constructor");
   }
   public abc(int a)
   {   
	   this();
	   System.out.println("1 parameterized constructor");
   }
   public abc(int a,int b)
   {   
	   this(60);
	   System.out.println("2 parameterized constructor");
   }
   public abc(int a,int b,int c)
   {   
	   this(40,50);
	   System.out.println("3 parameterized constructor");
   }
   public abc(int a,int b,int c,int d)
   {
	   System.out.println("4 parameterized constructor");
   }
   public static void main(String[] args) 
   {
	abc ob1=new abc(10,20,30);
	System.out.println("3rd time code changed");
   }
 }
