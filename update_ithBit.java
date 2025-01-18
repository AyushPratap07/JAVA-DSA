public class update_ithBit {
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 3,0));
    }
    public static int clearIthBit(int n, int i){
        int bitMask=~(1<<i);
        return n & bitMask; 
    }
    public static int updateIthBit(int n, int i,int newBit){
        n=clearIthBit(n, i);
        int bitMask=(newBit<<i);
        return n | bitMask; 
    }
    
}
