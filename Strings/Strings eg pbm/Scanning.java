import java.util.*;
public class Scanning {
    public static void Input() {
        Scanner sc = new Scanner(System.in);
    // using next() function- only takes first word not the entire line of words
        String name = sc.next();
        System.out.println(name);
        sc.close();
    }
    public static void main(String[] args) {
        Input();  // no need to print, method already prints
    }
}
