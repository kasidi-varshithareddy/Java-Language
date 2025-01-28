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
class Stack
{
Node head;
Stack()
{
head=null;
}
void push(int x)
{
Node n=new Node(x);
if(n==null)
{
System.out.println("stack is overflow");
return;
}
if(head==null)
{
head=n;
}
else
{
n.next=head;
head=n;
}
}
void pop()
{
if(head==null)
{
System.out.println("stack is underflow");
return;
}
System.out.println(head.data+"is deleted");
head=head.next;
}
void display()
{
if(head==null)
{
System.out.println("stack is empty");
return;
}
Node temp;
for(temp=head;temp!=null;temp=temp.next)
{
System.out.println(temp.data+" ");
}
}
}

class StacksLinkedList
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Stack s1=new Stack();
for(;;)
{
System.out.println("1.push\n2.pop\n3.print\n4.exit");
System.out.println("enter yr choice:");
int ch=sc.nextInt();
if(ch==1)
{
System.out.println("enter the ele:");
int x=sc.nextInt();
s1.push(x);
}
else if(ch==2)
{
s1.pop();
}
else if(ch==3)
{
s1.display();
}
else if(ch==4)
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

