import java.util.*;
class siliconmade
{
	public static void main(String [] args)
	{
	int a=5;
	int b=6;
	try
	{
	int d=b/a;
	System.out.pritnln(" d"+d);
	}
	catch(ArithmeticException e)
	{
	System.out.pritnln(e);
	System.out.println(e.printStacktrace);
	System.out.println(e.getMesssage);
	System.out.println(e.toString);
	}
	}
	
	}
	
	
	
	