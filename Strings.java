import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] ch = s1.toCharArray();
        int length = ch.length;
        for (int i = 1; i < length; i += 2) {
            int j = i;
            while (j < length && (j + 2) < length) {
                char temp = ch[j];
                ch[j] = ch[j + 2];
                ch[j + 2] = temp;
                j += 2;
            }
        }
        System.out.println(new String(ch));
    }
}
