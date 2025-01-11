import java.util.*;
public class pattern {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int x=n;
                if (i==1 || j==1 || j==x || i==x){
                System.out.print("*"+" ");
                }
            }
            System.out.println();
        }

    }
}
class starpattern {
    public static void main(String args[]){
        int x=1;
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                //x=(char)(x+1);
                x++;
            }
            System.out.println();
        }

    }
}
class inverted_star {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
class pattern1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            //int x=1;
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
                //x=(char)(x+1);
                //x++;
            }
            System.out.println();
        }

    }
}
