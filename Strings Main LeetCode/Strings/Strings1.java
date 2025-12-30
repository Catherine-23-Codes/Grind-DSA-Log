public class Strings1 {
    public static void StringsExample(){
// method 1: using string pool-static method
        String s="Welcome";
        System.out.println("the string is:"+s);
// method 2: using "NEW" Keyword
        String s1=new String("Welcome!");
        System.out.println("the new string is:"+s1);
    }
    public static void main(String[] args) {
        StringsExample();
    }
}
