import java.util.*;
class made{
public static void main(String[] args)
{
  Scanner sc= new Scanner(System.in);
  System.out.println("enter a and b");
  int a=sc.nextInt();
  int b=sc.nextInt();
  
   try{
  int d=b/a;
 
  System.out.println("result"+d);
  }
  catch(ArithmeticException i)
  {
	  System.out.println(i);
}
	  System.out.println("Divisor should not be zero");
}
}



  
