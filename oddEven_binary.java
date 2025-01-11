public class oddEven_binary {
    public static void oddoreven(int n){
        int bitMask=1;
        if ((n&bitMask)==0){
            //even number
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddoreven(0);
        oddoreven(18);
        oddoreven(19);
        oddoreven(77);
    }
    
}
 