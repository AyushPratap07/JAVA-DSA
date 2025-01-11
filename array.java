import java.util.*;
public class array{
    public static void update(int marks[]){
        for (int i=0;i<marks.length;i++){
            marks[i]=marks[i]+2;
        }
    }
    public static int linear_search(int marks[]/* ,int key*/){
        int largest=marks[0];
        for  (int i=0;i<marks.length;i++){
            if  (marks[i]>largest){
                largest=marks[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Length of array : ");
        int n=sc.nextInt();
        System.out.print("Elements of array : ");
        int marks[]=new int[n];
        for  (int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            }
        /*System.out.print("Enter element to search : ");
        int key=sc.nextInt();*/
        //update(marks);
        int result=linear_search(marks);
        System.out.println("Largest element in array is : "+result);
        /*if(result==-1){
            System.out.println("Element not found");
            }
        else{
            System.out.println("Element found at index "+result);
        } */  

        /*for (int i=0;i< marks.length ;i++){
            System.out.print( marks[i]+" ");
        }
        System.out.println();*/
    }
}