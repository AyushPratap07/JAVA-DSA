import java.util.*;
public class twodarray{
    public static void search(int matrix[][]){
        int l=Integer.MIN_VALUE, s=Integer.MAX_VALUE;
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>l){
                    l=matrix[i][j];
                }
                if(matrix[i][j]<s){
                    s=matrix[i][j];
                }
            }
        }
        System.out.println("Largest = "+l+" Smallest = "+s);
    }
    public static void searchseven(int matrix[][],int k){
        int c=0;
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==k){
                    c+=1;
                }
            }
        }if (c>0){
            System.out.println("Total no of 7's are : "+c);
        }
        else{
            System.out.println("No 7 are there");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    int k=7;
    searchseven(matrix,k);

    }
}