import java.util.*;
//To find the Longest Common Prefix of String array
public class LongestCommonPrefix {
    public static String longestPrefix(String[] str){
       int n=str.length;
       Arrays.sort(str);
       if(n==0){
        return "";
       }
       String first=str[0];
       String last=str[n-1];
       int len=Math.min(first.length(),last.length());
       int i;
       for(i=0;i<len;i++){
         if(first.charAt(i)!=last.charAt(i)){
            break;
         }
       }
       return first.substring(0, i);

    }
    public static void main(String args[]){
        //Input test case
        String[] arr = {"flower", "flow", "flight"};

        // Output the result
        System.out.println("Longest Common Prefix: " + longestPrefix(arr));  //flo
    }
}