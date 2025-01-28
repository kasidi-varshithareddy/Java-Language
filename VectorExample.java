import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(10);
        v.add(11);
        v.add(12);
        v.add(13);
        v.add("varsha");
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
    }
}
