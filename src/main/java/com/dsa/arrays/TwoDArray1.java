import java.util.Scanner;
//take input and search x and print indices
public class TwoDArray1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int rows =sc.nextInt();
        int cols=sc.nextInt();
        int [][] numbers= new int [rows][cols];
         for(int i=0; i<rows;i++){
            for(int j=0; j<cols;j++){
                numbers[i][j]=sc.nextInt();

            }
         }
         int x = sc.nextInt();
          for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                // compare with x
                if( numbers[i][j] == x){
                System.out.println("x is found "+i+","+j);
                }
                System.out.println();
            }
          }
    }
}
