public class SameCheck {
    public static boolean CheckSameChar(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str2.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(CheckSameChar("Catherine", "Catheline"));
    }
}
