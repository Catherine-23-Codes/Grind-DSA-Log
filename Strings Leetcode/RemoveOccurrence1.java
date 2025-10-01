public class RemoveOccurrence1 {
    public static void main(String args[]){
        String s="google games";
        char ch='g';
        s=s.replace(String.valueOf('g'),"");
        System.out.println(s);
    }
}
