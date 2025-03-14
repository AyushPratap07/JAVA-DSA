import java.util.*;
public class spiral_matrix {
    public static void printspiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while( startRow<=endRow && startCol<=endCol){
            //top
            for (int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for (int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for (int j=endCol-1;j>=startCol;j--){
               /*  if (startRow==endRow){
                    break;
                }*/
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for (int i=endRow-1;i>=startRow+1;i--){
                /*if (startCol==endCol){
                    break;
                }*/
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        printspiral(matrix);
    }
}
