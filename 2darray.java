import java.util.*;
public class 2darray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[sc.nextInt()][sc.nextInt()];
        for (int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[1].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for (int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[1].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}