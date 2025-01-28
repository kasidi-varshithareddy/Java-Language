import java.util.*;
public class LinkedListCollection
{
public static void main(String args[])
{
LinkedList l1=new LinkedList();
l1.add(60);
l1.add(90);
l1.add("java");
System.out.println(l1);
for(int i=0;i<l1.size();i++)
{
System.out.println(l1.get(i));
}
Iterator itr=l1.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}