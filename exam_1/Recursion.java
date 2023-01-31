public class Recursion1 {

    public static void main(String[] args) {
        
        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters
        
        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullName = "erol chester abuan";

        removeConsonants(fullName);
    }

    static void removeConsonants(String fullName) {
        if (fullName.isEmpty()) {
            return;
        }
        char c = fullName.charAt(0);
        if(!isVowel(c)) {
            removeConsonants(fullName.substring(1));
        }
        else {
            System.out.println(fullName);
            removeConsonants(removeFirstConsonant(fullName, (1)));
            //im sorry sir i cant do it :(
        }
    }

    static String removeFirstConsonant(String fullName, int i) {

        if (!isVowel(fullName.charAt(i))) {
            return fullName.substring(0, i ) + fullName.substring (1 + i);
        }
        else {
            removeFirstConsonant(fullName, i + 1);
        }
        return fullName;
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == ' ';
    }
}
