//Difference b/w sc.next() and sc.nextLine()
import java.util.*;
public class Str2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name you want to print:");
        String s1=sc.next();
        System.out.println("The name is :"+ s1);
        sc.nextLine();

        String s2= sc.nextLine();
        System.out.println("The name is:"+s2);
    }
}
