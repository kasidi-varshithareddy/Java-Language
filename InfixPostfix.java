import java.util.*;
public class InfixPostfix
{
static int pre(char c)
{
switch(c)
{
case'*':
case'/':
return 2;
case'+':
case'-':
return 1;
default:
return 0;
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter infix expression:");
String in=s.next();
String post="";
Stack<Character> st=new Stack<>();
for(int i=0;i<in.length();i++)
{
char ch=in.charAt(i);
if(Character.isLetterOrDigit(ch))
{
post=post+ch;
}
else if(st.empty())
{
st.push(ch);
}
else
{
while(!st.empty()&&pre(ch)<=pre(st.peek()))
{
post=post+st.pop();
}
st.push(ch);
}
}
while(!st.empty())
{
post=post+st.pop();
}
System.out.println(post);
}
}

