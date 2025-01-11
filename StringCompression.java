public class StringCompression{
    public static void main(String[] args) {
        String str = "abbaaaaacccdddbaccdd";
        System.out.println(compressString(str));
    }
    public static String compressString(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                i++;
                count++;
            }
            sb.append(a);
            if (count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
}