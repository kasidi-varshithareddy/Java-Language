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
{
que.add(temp.left);
}
if(temp.right==null)
{
temp.right=new Node(x);
break;
}
else
{
que.add(temp.right);
}
}
}
void printTree(Node root)
{
if(root!=null)
{
printTree(root.left);
System.out.print(root.data+" ");
printTree(root.right);
}
}
int countNodes(Node root) 
{
if (root==null) 
{
return 0; 
}
int count = 0;
Queue<Node> queue = new LinkedList<>();
queue.add(root);
while (!queue.isEmpty()) 
{
Node temp = queue.poll();
count++;
if (temp.left!=null) 
{
queue.add(temp.left);
}
if (temp.right!=null) 
{
queue.add(temp.right);
}
}
return count;
}
}
class Tree
{
public static void main(String args[])
{
int x;
Scanner s=new Scanner(System.in);
System.out.println("Enter root node");
x=s.nextInt();
Node root=new Node(x);
while(true)
{
System.out.println();
System.out.println("1.insert\n2.print\n3.count\n4.exit");
System.out.println("enter yr choice:");
int ch=s.nextInt();
if(ch==1)
{
System.out.println("enter the ele:");
x=s.nextInt();
root.insert(root,x);
}
else if(ch==2)
{
root.printTree(root);
}
else if(ch==3)
{
int count = root.countNodes(root);
System.out.println("Nodes:"+count);
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
