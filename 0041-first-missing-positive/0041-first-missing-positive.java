class Solution {
    public int firstMissingPositive(int[] nums) {
        
    int i = 0;
        while (i < nums.length) {


        if (nums[i] != i + 1) {
            int correctIndex = nums[i] - 1;
            if ( nums[i]>0 && // greater than 0 due to only +ve integers
                    nums[i]<=nums.length &&
                    nums[i] != nums[correctIndex]) {
                swap(i, nums, correctIndex);
            }
            else {
                i++;
            }
        }
        else{
            i++;
        }
    }
    ///  first missing number will be at index +1 
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }
        return nums.length+1;
    }



private static void swap(int i, int[] nums, int correctIndex) {
    int temp=nums[i];
    nums[i]=nums[correctIndex];
    nums[correctIndex]=temp;
        
    }
}