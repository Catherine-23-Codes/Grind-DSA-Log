package Length_w;
public class o_inbuilt {
    public static int getLength(String str){
        int count=0;
        for(char c:str.toCharArray()){
            count++;
        }
    //count = total number of characters in the string.
        return count;
    }
    public static void main(String[] args) {
        System.out.println(getLength("Apple Man go"));
    }
}
