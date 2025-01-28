import java.util.*;

class EnumerationExample {
    public static void main(String[] args) {
        Vector<Integer> a = new Vector<>();
        a.add(5);
        a.add(10);
        a.add(15);
        
        Enumeration<Integer> e = a.elements();
        
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
