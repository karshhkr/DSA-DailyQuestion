class Solution {
    public void duplicateZeros(int[] arr) {
        int [] dest = new int [arr.length];
        int src =0;
        int des=0;
        
        while(src<arr.length){
            
            if(arr[src]==0){
            if(des<arr.length){
           dest[des]=0;
            }
              
                des+=1;
                if(des<arr.length){
                  dest[des]=0;
                }
              

            }
            else {
                if(des<arr.length){
                   dest[des]=arr[src];
                }
              
            }
             des+=1;
        src+=1;
        }
       
    
    for (int i =0; i<arr.length; i++){
        arr[i]= dest[i];
    }
}
}