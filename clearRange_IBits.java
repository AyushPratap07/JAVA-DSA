public class clearRange_IBits {
    public static void main(String args[]){
        System.out.println(clearRange(2515, 2, 7));
    }
    public static int clearRange(int n,int i,int j){
        int a=-1<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }
}
