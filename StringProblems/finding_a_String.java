/*Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters. */



import java.util.Scanner;
public class finding_a_string {
    public int strStr(String haystack, String needle) {
        int n=needle.length(); 
        String st="";
        for(int i=0;i<haystack.length()-(n-1);i++){
            st=haystack.substring(i,i+n); // The substring(start_point,end_point) extracts a string from the given indexes of String
            if(st.equals(needle)){
                return i;
            }
                
        }
            return -1;
        }

        public static void main(String args[]){
            finding_a_string obj = new finding_a_string();
            @SuppressWarnings("resource")
            Scanner read = new Scanner(System.in);
            System.out.println("Hey enter the string to be searched ");
            String s = read.next();
            System.out.println("Hey bitch enter the string to search");
            String s1 =read.next();
            if(obj.strStr(s, s1)==-1)
            System.out.println(s1+" not found in"+s);
            else
            System.out.println(s1+"  found in "+s+" at "+obj.strStr(s, s1)); 
        }

        


    }

