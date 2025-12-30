public class Create_String {
    public static void main(String[] args) {

    //1.creating objs in memory pool
        String A="Catherine";
        String B="Catherine";
        if(A==B){
            System.out.println("Two strings are equal");
        }else{
            System.out.println("Two Strings are unequal!");
        }


    //2.creating a new String using NEW Keyword! 

    String s1=new String("Catherine");
    String s2=new String("Catherine");
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));
        
    }
}
