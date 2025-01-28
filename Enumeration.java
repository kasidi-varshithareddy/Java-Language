import java.util.*;

class Enumeration {
    public static void main(String[] args) {
        Vector<Integer> a = new Vector<>();
        a.add(5);  
        a.add(10);
        a.add(15); 
        Enumeration<Integer> e=a.elements();
            while(e.hasmoreElements())
            {
                System.out.println(e.nextElement());
             }
        
    }
}
