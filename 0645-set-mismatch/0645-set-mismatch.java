class Solution {
    public int[] findErrorNums(int[] nums) {
          int i = 0;
        while (i < nums.length) {


            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
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
          ///  first missing number
             for(int index=0; index<nums.length;index++){
                 if(nums[index]!=index+1){
                     return new int[] {nums[index], index+1};
                 }
             }
             return new int [] {-1,-1};
        }


    private static void swap(int i, int[] nums, int correctIndex) {
        int temp=nums[i];
        nums[i]=nums[correctIndex];
        nums[correctIndex]=temp;

        
    }
}