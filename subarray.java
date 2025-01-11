import java.util.*;
public class subarray {
    public static void printSubarrays(int numbers[]){
        int max_sum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start=i;
            for(int j=i; j<numbers.length; j++){
                int curr_sum=0;
                int end=j;
                for (int k=start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                    curr_sum+=numbers[k];
                    if (curr_sum>max_sum){
                        max_sum=curr_sum;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("maximum Sum ="+max_sum);
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        printSubarrays(numbers);
    }
}
