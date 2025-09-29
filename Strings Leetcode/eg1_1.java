public class eg1_1 {
    public static void main(String[] args) {      
        String s1 = "java";     
        s1.concat(" rules");
      
        // s1 is not changed because strings are
        // immutable
        System.out.println("s1 refers to " + s1);
    }
}

