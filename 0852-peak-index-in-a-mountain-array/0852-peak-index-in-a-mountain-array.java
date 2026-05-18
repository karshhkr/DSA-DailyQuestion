class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
while(start<end){
    int mid =start+(end-start)/2;
    if(arr[mid]>arr[mid+1]){
        end=mid;//  we at the decreasing side of the array 

    }else if (arr[mid]<arr[mid+1]){
        start=mid+1;//  we at the increasing side of the array 
    }
}
return start;
    }
}