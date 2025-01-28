import java.util.*;
class Stack
{
int a[];
int top;
int size;
Stack(int n)
{
top=-1;
size=n;
a=new int[n];
}
void push(int x)
{
if(top==size-1)
{
System.out.println("stack is overflow");

return;
}
top=top+1;
a[top]=x;
}
void pop()
{
if(top==-1)
{
System.out.println("stack is underflow");
return;
}
System.out.println(a[top]+"is deleted");
top=top-1;
}
void display()
{
if(top==-1)
{
System.out.println("stack is empty");
return;
}
for(int i=top;i>=0;i--)
{
System.out.println(a[i]+" ");
}
}
}

class Stacks
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size:");
int n=sc.nextInt();
Stack s1=new Stack(n);
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

