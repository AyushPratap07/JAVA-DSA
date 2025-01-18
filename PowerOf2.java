public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(PowerOF2(1024));
    }
    public static boolean PowerOF2(int n){
        return (n&(n-1))==0;
    }
}
