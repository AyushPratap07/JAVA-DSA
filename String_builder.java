public class String_builder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for (char ch='a'; ch<='z';ch++){
            sb.append(ch);
            sb.append(' ');
        }
        //O(N)
        System.out.println(sb);
    }
}
