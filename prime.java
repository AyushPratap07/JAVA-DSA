import java.util.*;

public class prime {
    public static boolean isprime(int n){
        for (int div=2; div<n;div++) {
            if (n % div == 0) {
                return false;
            } 
        }
        return true;
    }
    public static void primeinrange(int n){
        for (int i=2; i<n;i++) {
            if (isprime(i)) {
                System.out.print(i+" ");
            } 
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();      
        primeinrange(n);
    }
}