public class Palindrome7 {
    public static boolean isPalindrome(String inputString) {
        inputString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] charArray = inputString.toCharArray();

        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            if (charArray[i] != charArray[j]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String myString = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(myString));  // true

        myString = "Hello, World!";
        System.out.println(isPalindrome(myString));  // false
    }
}