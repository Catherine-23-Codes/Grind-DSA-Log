public class charAt2 {
    public static void PrintLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName="Catherine";
        String lastName="Infanta";
        String fullName=firstName + " " + lastName;
        System.out.println("The full name is:"+fullName);
        PrintLetters(fullName);
    }
}
