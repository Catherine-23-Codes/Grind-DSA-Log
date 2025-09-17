// This is a reusable method and much preferable that is used to take
// i/p from the user

import java.util.*;
public class StrParameters2 {
    public static void StringResuable(String str){
        System.out.println("the string is:"+str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
        System.out.println("The string is:"+str);
    }
}
