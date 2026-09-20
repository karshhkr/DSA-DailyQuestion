class Solution {
    public int findNumbers(int nums[]){
        int evenCount =0;
        for(int num : nums){
            int digitCounts= (int) Math.floor(Math.log10(num))+1;
            if(digitCounts %2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
}