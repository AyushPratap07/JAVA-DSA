public class clear_ithBit {
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 3));
    }
    public static int clearIthBit(int n, int i){
        int bitMask=~(1<<i);
        return n & bitMask; 
    }
    
}
 
