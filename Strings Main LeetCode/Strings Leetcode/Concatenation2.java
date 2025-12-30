public class Concatenation2 {
    public static String concat(String s1, String s2) {
        StringBuilder res = new StringBuilder();
        
        // Append s1 to res
        for (char c : s1.toCharArray()) {
            res.append(c);
        }
        
        // Append s2 to res
        for (char c : s2.toCharArray()) {
            res.append(c);
        }
        
        return res.toString();
    }
    
    public static void main(String[] args) {
        String s1 = "Hello, ";
        String s2 = "World!";
        
        // Call the function to concatenate the strings
        String res = concat(s1, s2);
        
        System.out.println(res);
    }
}

