public class Count_SetBits {
    public static void main(String args[]){
        System.out.println(CountSetBits(32));

    }
    public static int CountSetBits(int n){
        int c=0;
        while (n>0){    //T.C.=O(n)
            if ((n&1)!=0){//to check LSB
                c=c+1;
            }
            n=n>>1;
        }
        return c;
    }
}
