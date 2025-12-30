package Length_w.length_w;

public class o_1_inbuilt {
    public static int getLength(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(getLength("Google SDE Intern 2026"));
    }
}

/*
 * TC=O(n)
 * SC=O(1) no extra array is used
 */
