import java.util.*;
public class binarytodecimal{
    public static void bintoDeci(int n){
        int pow=0;
        int deci=0;
        while(n>0){
            int lastdigit=n%10;
            deci=deci+(lastdigit*(int)(Math.pow(2,pow)));
            pow++;
            n=n/10;
        }
        System.out.println("Decimal = "+deci);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary number = ");
        int deci=sc.nextInt();
        bintoDeci(deci);
    }
    
}