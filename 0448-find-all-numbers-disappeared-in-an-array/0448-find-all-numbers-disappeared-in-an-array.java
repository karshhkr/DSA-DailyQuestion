class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        while ( i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!= nums[correctIndex]){
                swap(nums, i ,correctIndex);
            }
            else{
                i++;
            }
        }
        //just missing Numbers 
         List <Integer> ans = new ArrayList<>();
        for(int index=0; index<nums.length; index ++)
        {
            if(nums[index]!= index +1 ){
          ans.add(index+1);
            }
        }
        return ans;
    }
        private static void swap(int nums[], int i , int correctIndex){
            int temp=  nums[i];
            nums[i]= nums [correctIndex];
            nums[correctIndex]= temp;
        
    }
}