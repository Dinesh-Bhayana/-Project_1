package pkg1;

public class thiskeyword 
 {
    public void m()
    {   
    	this.m3(10,20,30);
    	System.out.println("default method");
    }
    public void m1(int a)
    {   
    	this.m4(10,20,30,40);
    	System.out.println("1 parameterized method");
    }
    public void m2(int a1,int a2)
    {   
    	this.m1(30);
    	System.out.println("2 parameterized method");
    }
    public void m3(int a1,int a2,int a3)
    {
    	System.out.println("3 parameterized method");
    }
    public void m4(int a1,int a2,int a3,int a4)
    {   
    	this.m();
    	System.out.println("4 parameterized method");
    }
    public static void main(String[] args) 
    {   
	   thiskeyword ob=new thiskeyword();
	   ob.m2(10,20);
	}
 } 
