public class FastExponentiation {
    public static void main(String args[]){
        System.out.println(Fast_Exponent(5,1));
    }
    public static int Fast_Exponent(int a,int n){
        int ans=1;
        while (n>0){    //T.C.=O(n)
            if ((n&1)!=0){//to check LSB
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
        
    }
}
