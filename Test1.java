import java.util.*;
class parent
{
void display()
{
System.out.println("parent class");
}
}

class child1 extends parent
{
void show1()
{
System.out.println("child1 class");
}
}
class child2 extends parent{
void show2()
{
System.out.println("child2 class");
}
}
 class test1
{
public static void main(String[] args)
{
	child1 obj1=new child1();
	obj1.show1();
	obj1.display();
	child2 obj2=new child2();

	obj2.show2();
		}
}

