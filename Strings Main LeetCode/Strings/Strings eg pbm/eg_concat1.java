public class eg_concat1 {
    public static void main(String args[]){
    //METHOD 1: Normal way to assign string
        String str="Catherine";
        str.concat("infanta");
    // here string is not assigned back
        System.out.println("The name is:"+str);

    //METHOD 2: Explicitly used to assign strings
        String str2="Catherine";
        str2=str2.concat("Infanta");
    // here string is assigned back
        System.out.println("The name is:"+str2);
    }
}
