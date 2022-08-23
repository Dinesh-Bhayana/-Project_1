package pkg1;

public class assignment1 
  {   
     public int sum(int a,int b)
     {
    	 int c;
    	 c=a+b;
    	 return(c);
     }
     public int sub(int a1,int a2)
     {
    	 int c;
    	 c=a1-a2;
    	 return(c);
     }
     public int mul(int a3,int a4)
     {
    	 int c;
    	 c=a3*a4;
    	 return(c);
     }
     public void divide(float x,float y)
     {
    	 float c;
    	 c=x/y;
    	 System.out.println("Final result is "+c);
     }
     public static void main(String[] args) 
     {
       assignment1 obj=new assignment1();
       int sumResult1=obj.sum(10,2);
       int sumResult2=obj.sum(sumResult1,2);
       int subResult=obj.sub(sumResult2,2);
       int mulResult=obj.mul(subResult,2);
       obj.divide(mulResult,2);     
	 }
   } 
