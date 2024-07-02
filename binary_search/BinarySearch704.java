package binary_search;

/*
704. Binary Search

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1 */

public class BinarySearch704 {
    public static void main(String[] args) {
        System.out.println(BinarySearch704.findTarget(new int[]{-1,0  },0));
    }

    private static int findTarget(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;
        while (l <= r) {
            int mid = (r + l )/2;
            if(arr[mid] < target){
                l = mid + 1;
            }else if(arr[mid] > target){
                r = mid - 1;
            }else{
                return mid;
            }
        }
       return -1;
    }
}
