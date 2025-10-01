public class Search_Char1 {
    public static int searchChar(String str, char ch){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(searchChar("Catherine Infanta", 'f'));
        // o/p space is also counted! 
    }
}
