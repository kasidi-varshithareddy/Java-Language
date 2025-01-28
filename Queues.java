import java.util.*;
class Queue
{
int a[];
int front,rear;
int size;
Queue(int n)
{
front=-1;
rear=-1;
size=n;
a=new int[n];
}
void enqueue(int x)
{
if(rear==size-1)
{
System.out.println("queue is full");

return;
}
rear=rear+1;
a[rear]=x;
}
void dequeue()
{
if(front==rear)
{
System.out.println("queue is empty");
return;
}
front =front+1;
System.out.println(a[front]+"is deleted");
}
void display()
{
if(front==rear)
{
System.out.println("queue is empty");
return;
}
for(int i=front+1;i<=rear;i++)
{
System.out.println(a[i]+" ");
}
}
}

class Queues
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size:");
int n=sc.nextInt();
Queue s1=new Queue(n);
for(;;)
{
System.out.println("1.enqueue\n2.dequeue\n3.print\n4.exit");
System.out.println("enter yr choice:");
int ch=sc.nextInt();
if(ch==1)
{
System.out.println("enter the ele:");
int x=sc.nextInt();
s1.enqueue(x);
}
else if(ch==2)
{
s1.dequeue();
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

