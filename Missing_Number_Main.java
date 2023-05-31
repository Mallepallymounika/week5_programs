/* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 
 
Example 1:
 
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:
 
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:
 
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.*/
import java.util.Scanner;
public class Missing_Number_Main{
  public static void main(String[]args){
    Missing_Number a=new Missing_Number();
    a.missing();
    
  }
}
class Missing_Number {
  public void missing(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total number of elements");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the array elements");
   
    for(int i=0;i<size;i++){
     arr[i]=sc.nextInt(); 
      
    }
    System.out.println("the actual array elements are:");
   
  int sum=0;
    for(int i=0;i<size;i++){
      System.out.println(arr[i]);
       sum=sum+arr[i];
    }
    
    int actual_Sum=0;
    for(int i=0;i<=size;i++){
       actual_Sum=actual_Sum+i;
    }
    int dupli=actual_Sum-sum;
    System.out.println("missing number"+dupli);
  }
}
    