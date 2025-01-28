import java.util.*;
class Node
{
int data;
Node prev,next;
Node(int x)
{
data=x;
prev=null;
next=null;
}
}
class DoubleList
{
Node head,tail;
DoubleList()
{
head=tail=null;
}
void create(int x)
{
Node n=new Node(x);
if(head==null)
{
 head = tail = n;
}
else
{
tail.next=n;
n.prev=tail;
tail=n;
}
}
void rshow()
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
void lshow()
{
if(tail==null)
{
System.out.println("list is empty");
return;
}
Node temp=tail;
while(temp!=null)

{
System.out.println(temp.data+" ");
temp=temp.prev;
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
head.prev=n;
n.next=head;
head=n;
}
}
void insertPos(int pos,int x)
{
Node n=new Node(x);
if(head==null)
{
head=tail=n;
}
else
{
Node temp=head;
int count=1;
while(count<pos && temp.next!=null)
{
count=count+1;
temp=temp.next;
}
if(temp.next==null)
{
temp.next=n;
n.prev=temp;
tail=n;
}
else
{
n.next=temp;
n.prev=temp.prev;
temp.prev.next=n;
temp.prev=n;
}
}
}
void deleteFirst()
{
if(head==null)
{
System.out.println("list is empty");
return;
}
else
{
Node temp=head;
head=head.next;
head.prev=null;
temp=null;
}
}
void deleteLast()
{
if(head==null)
{
System.out.println("list empty");
return;
}
else
{
Node temp=tail;
tail=tail.prev;
tail.next=null;
temp=null;
}
}
void deletePos(int pos1)
{
if(head==null)
{
System.out.println("list is empty");
}
int count1=1;
Node temp=head;
while(count1<pos1&&temp.next!=null)
{
count1=count1+1;
temp=temp.next;
}
if(temp.next==null)
{
temp.prev.next=null;
tail=temp.prev;
temp=null;
}
else
{
temp.prev.next=temp.next;
temp.next.prev=temp.prev;
temp=null;
}
}
}
class DoubleLinkedList
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
DoubleList d1=new DoubleList();
for(;;)
{
System.out.println("1.create\n2.print\n3.insertfirst\n4.insertpos\n5.deletefirst\n6.deletepos\n7.deletelast\n8.exit");
System.out.println("enter yr choice:");

int ch=s.nextInt();
if(ch==1)
{
int x;
System.out.println("enter the element:");
x=s.nextInt();
d1.create(x);
}
else if(ch==2)
{
System.out.println("which direction traverse 1.forward\n2.backward");
int r=s.nextInt();
if(r==1)
{
d1.rshow();
}
else if(r==2)
{
d1.lshow();
}
else
{
System.out.println("inavalid");
}
}
else if(ch==3)
{
System.out.println("enter an ele");
int x=s.nextInt();
d1.insertFirst(x);
}
else if(ch==4)
{
int pos,x;
System.out.println("enter pos and ele");
pos=s.nextInt();
x=s.nextInt();
d1.insertPos(pos,x);
}
else if(ch==5)
{
d1.deleteFirst();
}
else if(ch==6)
{
System.out.println("enter pos:");
int pos1=s.nextInt();
d1.deletePos(pos1);
}
else if(ch==7)
{
d1.deleteLast();
}
else if(ch==8)
{
break;
}
else
{
System.out.println("inavalid");
}
}
}
}


