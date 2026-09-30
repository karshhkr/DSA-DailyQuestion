class Solution {
    public int findDuplicate(int[] nums) {
         int i = 0;
        while (i < nums.length) {
             if(nums[i]!=i+1) {

                 int correctIndex = nums[i] - 1;
                 if (nums[i] != nums[correctIndex]) {
                     swap(i, nums, correctIndex);
                 }else {
                     return nums[i];
                 }
             } else{
                i++;
                 }


        }
       return -1;
    }

        private static void swap ( int i, int[] nums, int correctIndex){
       int temp=nums[i];
       nums[i]=nums[correctIndex];
       nums[correctIndex]=temp;

    
    }
}