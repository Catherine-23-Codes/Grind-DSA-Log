public class newpalindrome {
    public static boolean Palindrome(String str){
        for(int i=0;i<str.length()/2;i++){ //half length
            int n=str.length();
            if(str.charAt(i) !=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Palindrome("madam"));
    }
}

