import java.util.*;
class thow{
static void test()
{
try
{
throw new NullpointerException ("Hello");
}
catch(NullpointerException e)
{
throw e;
}
}
class main
{
public static void main(String[] args)
{
try{
test();
}
catch (NullpointerException e)
{
System.out.println("caught in main method");
System.out.println(e.getMessage());
}
}
}
}
