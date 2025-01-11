import java.util.*;
public class decitobinary{
    public static void decitoBin(int n){
        int bin=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            bin=bin+(rem*(int)(Math.pow(10,pow)));
            pow++;
            n=n/2;
        }
        System.out.println("Binary = "+bin);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimal number = ");
        int deci=sc.nextInt();
        decitoBin(deci);
    }
    
}

