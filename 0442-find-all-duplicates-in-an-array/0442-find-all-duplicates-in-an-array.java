class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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

// search for missing number
            List<Integer>ans =new ArrayList<>();
            for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                 ans.add(nums[index]);
                }
            }
            return ans;
        }
        private static void swap( int i, int[] nums, int correctIndex){
    int temp=nums[i];
    nums[i]=nums[correctIndex];
    nums[correctIndex]=temp;

    }
}