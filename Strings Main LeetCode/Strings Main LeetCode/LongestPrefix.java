public class LongestPrefix {
    public static String longestPrefixLength(String[] strs){
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())    return "";
            }
        }
        return prefix;
    }
/* CASE 1
 * // flow.indexOf(flower )
    // flower -> flowe & flow 
    // flowe -> flow & flow, so here its satisfied 
 */
/* CASE 2
 *  flow & flyover
 *      flyover.indexOf(flow)
 *      flyo & flow not same 
 *      fly & flo not same
 *      fl & fl same
 *  return the current prefix as fl
 * 
 * CASE 3
 * current prefix= fl
 * fl.indexOf(flight)
 * fl & flight not same
 * fl & flight -> fl & fl
 * fl & fl same
 *  so final current prefix as "fl"
 * 
 */

    public static void main(String[] args) {
        String[] words={"flower","flow","flyover","flight"};
        String result= longestPrefixLength(words);
        System.out.println("The longest prefix length:"+result);
    }
}
