package pkg1;

public class assignment2 
 {
   public int sum(int x,int y)
   {
	   int c=x+y;
	   return(c);
   }
   public int sub(int a1,int a2)
   {
	   int c=a1-a2;
	   return(c);
   }
   public int mul(int a1,int a2)
   {
	  int c=a1*a2;
	  return(c);
   }
   public void divide(float a1,float a2)
   {
	  float c=a1/a2;
	  System.out.println("Final Result is "+c);
   }
   public static void main(String[] args) 
   {
	assignment2 obj=new assignment2();
	int subResult=obj.sub(10,2);
	int sumResult1=obj.sum(subResult,2);
	int subResult2=obj.sub(sumResult1,2);
	int mulResult=obj.mul(subResult2,2);
	obj.divide(mulResult,2);
   }
 }
