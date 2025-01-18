public class clear_iBits{
    public static void main(String args[]){
        System.out.println(cleariBits(14, 4));
        System.out.println((-1>>(10)));
    }
    public static int cleariBits(int n,int i){
        int bitMask=(-1)<<i;
        return n&bitMask;
    }
}