  # Given a signed 32-bit integer x,
  # return x with its digits reversed. 
  # If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
/* Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21

*/
    
//Code
import java.util.Scanner; 
    public class rev 
    {

     public int reverse(int x) 
     
      {
      
        if( (x > Math.pow(2,31)-1) || ( x < - Math.pow (2 ,31) ) )
        return 0;
        int temp=Math.abs(x);
        long rev = 0;
     while ( temp > 0 )
       {
           rev=rev*10+temp%10;
           temp=temp/10; 
    }
     if(rev > Math.pow(2,31)-1)
     return 0;
    if(x<0)
    return (int)-rev;
    else 
    return (int)rev;
}
public static void main (String args[])
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = in.nextInt();
    rev obj = new rev();
    System.out.println("Reversed Integer is \t"+obj.reverse(num));
}
}
