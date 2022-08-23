package pkg1;

public class Arithmetic
  {   
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum Result is "+c);
		return(c);
	}
    public int sub(int x,int y)
    {
    	int c;
    	c=x-y;
    	System.out.println("Subtraction result is "+c);
    	return(c);
    }
    public void mul(int a1,int a2)
    {
    	int c;
    	c=a1*a2;
    	System.out.println("Final result is "+c);
    }
    
    public static void main(String[] args) 
    {
    	Arithmetic obj=new Arithmetic();
    	int sumResult=obj.sum(12,10);
    	int subResult=obj.sub(30,20);
    	obj.mul(sumResult,subResult);
    		
	}
  }
