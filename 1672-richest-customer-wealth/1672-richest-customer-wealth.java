class Solution {
    public int maximumWealth(int[][] accounts) {
          int ans=Integer.MIN_VALUE;
      
for (int person=0; person<accounts.length; person++){
  int sum=0;
    //person=row
    //accounts=col
    for (int account=0; account<accounts[person].length; account++){

////// sum of rows and cols////
        sum+=accounts[person][account];

        }

    if (sum>ans){
        ans=sum;
    }
    }
return ans;
}
        
    }
