public class checkSame_2 {
    public static boolean isSame(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="Ball";
        String str2="Balloon";
        System.out.println(isSame(str1,str2));
    }
}
