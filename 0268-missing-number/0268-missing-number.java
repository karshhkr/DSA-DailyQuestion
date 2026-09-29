class Solution {
    public int missingNumber(int[] nums) {
        
    int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length &&
                    nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);

            } else {
                i++;
            }
        }
// search for first missing number
        for(int index=0;index<nums.length;index++){
if(nums[index]!=index){
    return index;
}
        }
        return nums.length;
    }

    private static void swap(int[] nums, int i, int correctIndex) {

     int temp=nums[i];
    nums[i]=nums[correctIndex];
    nums[correctIndex]=temp;
    }

}