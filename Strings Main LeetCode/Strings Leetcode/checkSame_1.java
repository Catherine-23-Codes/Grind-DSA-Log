public class checkSame_1 {
    public static boolean  CheckIfStringSame(String str1, String str2){
        return str1.equals(str2); //inbuilt function -> .equals()
    }
    public static void main(String[] args) {
        String str1="Morning";
        String str2="Morning";

        if(CheckIfStringSame(str1,str2)){
            System.out.println("The strings are same!");
        }else{
            System.out.println("The strings are not the same!");
        }
    }
}
