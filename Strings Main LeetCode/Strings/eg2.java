// == -> Comparator operator
// Checks if reference variables are poniting to the same

public class eg2 {
    public static void main(String[] args) {
        String s1="Catherine";
        String s2="Katherine";
        System.out.println("Are the names equal?"+ s1==s2 );
        if(s1==s2){
            System.out.println("The names are same!");
        }else{
            System.out.println("The names are not same!");
        }
    }
}
