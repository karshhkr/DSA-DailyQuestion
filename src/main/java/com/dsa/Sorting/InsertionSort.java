package Sorting;

public class InsertionSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
         int arr[]={9,5,8,1,2,7};
         for(int i=1; i<arr.length; i++){
            int current= arr[i];
            int j=i-1;
            while( j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
         }
    printArray(arr);
}
    
}
