// this method where no paramter is passed within a function
// its non reusable method used to take i/p from user

import java.util.*;
public class StrParameters {
    public static void StringPassingParameters(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str= sc.nextLine();
        System.out.println("the string is:"+str);
    }
    public static void main(String[] args) {
        StringPassingParameters();
    }
}
