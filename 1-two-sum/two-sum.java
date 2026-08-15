class Solution {
    public int[] twoSum(int[] nums, int target) {
          int sum=0;   
       for(int i=0; i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
           sum=nums[i]+nums[j];
          int[]indices={i,j};
        if(sum==target){
            return indices;
        }
       }
       }
       return new int[]{};// ye tab ke liye agar target mila hi nahi tabhi mujhe return karwana padega isliye ...
    }
}
