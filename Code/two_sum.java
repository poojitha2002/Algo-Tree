
/*

Problem statement:  Given an array of integers and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

*/


import java.util.*;
public class MyClass {
    
    // This is the function which finds the two indices, whose values add upto given target
    public static int[] twoSum(int[] nums, int target) 
    {
       // Declaring an array to store the result (indices that add upto given target)
       int []a=new int[2];
       
       // We can use hashmap to store element as key and its index as value.
       // Declaring hashmap "hm"
       HashMap<Integer,Integer>hm=new HashMap<>();
       
       // Traverse the given array 
       
       for(int i=0;i<nums.length;i++)
        {
            // Now current number is nums[i] so we need to calculate a number when added to current number gives target or not.
            // So calculate target-nums[i] which is the other number when added to nums[i] gives target
            int other=target-nums[i];
            // Checking if other is present in our hashmap or not and note that it should not be the same as current number index.
            if(hm.containsKey(other) && hm.get(other)!=i)
              {
                // If other is present in hashmap then the two indices are i, hm.get(other). Store them in array and return that array.
                a[0]=i;
                a[1]=hm.get(other);
                return a;  
              }
            else
              {
                // If that number called "other" is not present in hashmap then add it to our hashmap
                hm.put(nums[i],i);
              }
        }
        // Return our final array
        return a;
    }   
    public static void main(String args[]) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt(); // Scanning number of elements 
     int []a=new int[n]; // Declaring an array to store the elements
     for(int i=0;i<n;i++)
     a[i]=s.nextInt();  // Scanning elements one by one
     int target=s.nextInt(); // Scanning target 
     int []result=twoSum(a,target); //Calling the function twoSum() and storing the result in an array named "array"
     for(int i=0;i<result.length;i++)
     System.out.print(result[i]+" "); // Printing the result
    }
}


/*

Input 1:
          5
          2 4 5 1 7
          8
Output:   4 3

Input 2: 
         4
         2 7 11 15
         9
Output:  1 0

--------------

Time Complexity : O(n)
Space Complexity: O(n) 

*/
