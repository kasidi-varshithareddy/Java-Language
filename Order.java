import java.util.*;
class Node
{
int data;
Node left,right;
Node(int x)
{
data=x;
left=null;
right=null;
}
void insert(Node root,int x)
{
Queue<Node> que=new LinkedList<>();
que.add(root);
while(!que.isEmpty())
{
Node temp=que.poll();
if(temp.left==null)
{
temp.left=new Node(x);
break;
}
else
que.add(temp.left);
if(temp.right==null)
{
temp.right=new Node(x);
break;
}
else
que.add(temp.right);
}
}
void preOrder(Node root)
{
if(root!=null)
{
System.out.print(root.data+" ");
preOrder(root.left);
preOrder(root.right);
}
}
void inOrder(Node root)
{
if(root!=null)
{
inOrder(root.left);
System.out.print(root.data+" ");
inOrder(root.right);
}
}
void postOrder(Node root)
{
if(root!=null)
{
postOrder(root.left);
postOrder(root.right);
System.out.print(root.data+" ");
}
}
/*int count(Node root)
{
if(root==null)
{
return 0;
}
return 1 + count(root.left) + count(root.right);
}*/
}
class Order
{
public static void main(String args[])
{
int x;
Scanner sc=new Scanner(System.in);
System.out.println("enter root node");
x=sc.nextInt();
Node root=new Node(x);
while(true)
{
System.out.println();
System.out.println("1.insert\n2.pre order\n3.in order\n4.post order\n5.exit");
System.out.println("enter ur choice");
int ch=sc.nextInt();
if(ch==1)
{
System.out.println("enter element");
x=sc.nextInt();
root.insert(root,x);
}
else if(ch==2)
{
root.preOrder(root);
}
else if(ch==3)
{
root.inOrder(root);
}
else if(ch==4)
{
root.postOrder(root);
}
else if(ch==5)
{
break;
}
else{
System.out.println("invalid choice");
}
}
}
}