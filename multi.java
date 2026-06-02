import java.util.*;
class gparent
{
 void gpdisplay()
	{
	System.out.println("i am grand parent");
		}
		}
		class parent extends gparent
		{
		void display()
		{
		System.out.println("i am parent");
		}
		}
		class child extends parent{
		void show()
		{
		System.out.println("i am child");
		}
		}
class driver
{
public static void main(String[] args)
{
 gparent obj1 =new gparent();
          obj1.gpdisplay();
 parent obj2=new parent();
			obj2.display();
			 child obj3=new child();
			obj3.show();
			}
			}
			
			