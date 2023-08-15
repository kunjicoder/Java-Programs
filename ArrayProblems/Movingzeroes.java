/* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
*/

import java.util.Scanner;
public class movezero {
    public void moveZeroes(int[] nums) {
        int k=0,j=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==0)
          k++;
        }
        for(int i=0;i<nums.length;i++){
          if(nums[i]!=0){
            nums[j]=nums[i];
            j++;
          }
        }
        if(k>0){
          for(int i=1;i<=k;i++)
            nums[nums.length-i]=0;
        }  
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size of array to be arranged");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        movezero obj = new movezero();
        obj.moveZeroes(arr);
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+"\t");
    }
    
}
