public class lowercase_vowel_count {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(countLowercaseVowels(str));
    }
    public static int countLowercaseVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
}
