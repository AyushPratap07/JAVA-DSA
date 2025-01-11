import java.util.*;
public class a {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int even=0;
        int odd=0;
        int i=0;
        do{
            
            System.out.print("Enter no : ");
            int n= sc.nextInt();
            if (n%2==0){
                even=even+n;
                i++;
            }
            else{
                odd=odd+n;
                i++;
            }
        }while (i<x);
        System.out.println("Sum of even integers"+even);
        System.out.println("Sum of odd integers"+odd);

    }
}
