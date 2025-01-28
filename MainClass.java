import java.util.ArrayList;

class MainClass {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);  
        a.add(10);
        a.add(15); 
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
