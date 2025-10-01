public class Insert1 {
    public static String insertCharacter(StringBuilder sb, char ch, int pos){
        sb.insert(pos, ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Cathrine");
        System.out.println(insertCharacter(sb, 'e', 4)); 
    }
}
