import java.util.*;
class Node
{
int data;
Node next;
Node(int x)
{
data=x;
next=null;
}
}
class Singlelist
{
Node head,tail;
Singlelist()
{
head=tail=null;
}
void create(int x)
{
Node n=new Node(x);
if(head==null)
{
head=tail=n;
}
else
{
Node temp=head;
while(temp!=null)
{
if(x==temp.data)
return;
temp=temp.next;
}
tail.next=n;
tail=n;
}
}
void display()
{
if(head==null)
{
System.out.println("List is empty");
return;
}
Node temp=head;
while(temp!=null)
{
System.out.println(temp.data+" ");
temp=temp.next;
}
}
}
public class Linkedlist{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Singlelist s1=new Singlelist();
while(true)
{
System.out.println("1.create\n2.print\n3.exit\n");
System.out.println("enter yout choice");
int ch=s.nextInt();
if(ch==1)
{
int x;
System.out.println("enter the element");
x=s.nextInt();
s1.create(x);
}
else if(ch==2)
{
s1.display();
}
else if(ch==3)
{
break;
}
else
{
System.out.println("Invalid choice");
}
}
}
}


