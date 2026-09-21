class Solution {
    public void duplicateZeros(int[] arr) {
    //     int [] dest = new int [arr.length];
    //     int src =0;
    //     int des=0;
        
    //     while(src<arr.length){
            
    //         if(arr[src]==0){
    //         if(des<arr.length){
    //        dest[des]=0;
    //         }
              
    //             des+=1;
    //             if(des<arr.length){
    //               dest[des]=0;
    //             }
              

    //         }
    //         else {
    //             if(des<arr.length){
    //                dest[des]=arr[src];
    //             }
              
    //         }
    //          des+=1;
    //     src+=1;
    //     }
       
    
    // for (int i =0; i<arr.length; i++){
    //     arr[i]= dest[i];
    // }




    //approach 2:- In line
    
    int possibleZeroDupli=0;
    int lastIndex=arr.length-1; 
    for (int i =0; i<=lastIndex -possibleZeroDupli; i++){
    if(arr[i]==0){
         if(i==lastIndex - possibleZeroDupli){
    
     arr[lastIndex]=0;
     lastIndex -=1;
break;

    }
     possibleZeroDupli++;
}
    }
     int newLastIndex=lastIndex-possibleZeroDupli;
      for (int i= newLastIndex; i>=0; i--){
        
        if(arr[i]==0){
            arr[i+possibleZeroDupli]=0;
            possibleZeroDupli--;
            arr[i+possibleZeroDupli]=0;
        }
        else{
            arr[i+possibleZeroDupli]=arr[i];
        }
      } 
    }
}
