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
class SingleList
{
Node head,tail;
SingleList()
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
else if(x<head.data)
{
n.next=head;
head=n;
}
else
{
Node temp=head;
while(temp.next!=null)
{
if(x<temp.next.data)
break;
else
temp=temp.next;
}
if(temp.next==null)
{
temp.next=n;
tail=n;
}
else
{
n.next=temp.next;
temp.next=n;
}
}
}
void display()
{
if(head==null)
{
System.out.println("list is empty");
return;
}
Node temp=head;
while(temp!=null)
{
System.out.println(temp.data+" ");
temp=temp.next;
}
}
void insertFirst(int x)
{
Node n=new Node(x);
if(head==null)
{
head=tail=n;
}
else
{
n.next=head;
head=n;
}
}
void insertPosition(int pos,int x)
{
Node n=new Node(x);
if(head==null)
{
head=tail=n;
}
else
{
Node temp=head;
int count=2;
while(count<pos && temp.next!=null)
{
count++;
temp=temp.next;
}
if(temp.next==null)
{
temp.next=n;
tail=n;
}
else
{
n.next=temp.next;
temp.next=n;
}
}
}
}

class AscendingLinked
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
SingleList s1=new SingleList();
for(;;)
{
System.out.println("1.create\n2.print\n3.insert\n4.insertpos\n5.exit");
System.out.println("enter ur choice");
int ch=s.nextInt();
if(ch==1)
{
int x;
System.out.println("enter an ele");
x=s.nextInt();
s1.create(x);
}
else if(ch==2)
{
s1.display();
}
else if(ch==3)
{
int x;
System.out.println("enter an ele");
x=s.nextInt();
s1.insertFirst(x);
}
else if(ch==4)
{
int pos,x;
System.out.println("enter pos and ele");
pos=s.nextInt();
x=s.nextInt();
s1.insertPosition(pos,x);
}
else if(ch==5)
{
break;
}
else
{
System.out.println("invalid");
}
}
}
}