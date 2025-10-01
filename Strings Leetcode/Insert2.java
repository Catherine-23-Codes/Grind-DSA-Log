public class Insert2 {
    static String insertChar(String s, char c, int pos) {
        if (pos < 0 || pos > s.length()) {  
            // invalid index, handle safely
            return s; 
        }
        return s.substring(0, pos) + c + s.substring(pos);
    }

    public static void main(String[] args) {
        String s = "DSA IN JAVA";
        System.out.println(insertChar(s, 'A', 3)); 
    }
}

