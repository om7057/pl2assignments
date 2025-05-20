import java.util.Arrays;

public class StringFunctions {

    public static void main(String[] args) {
        // Length of a String
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Length: " + length);

        // Concatenation
        String str1 = "Hello";
        String str2 = "World";
        String result = str1.concat(" " + str2);
        System.out.println("Concatenation: " + result);

        // Substring
        String original = "Java Programming";
        String subString = original.substring(5, 12);
        System.out.println("Substring: " + subString);

        // Character Extraction
        char charAtIndex = "Hello".charAt(2);
        System.out.println("Character at index 2: " + charAtIndex);

        // Conversion to Lowercase and Uppercase
        String caseExample = "Hello, World!";
        String lowercase = caseExample.toLowerCase();
        String uppercase = caseExample.toUpperCase();
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Uppercase: " + uppercase);

        // Trimming (Removing Leading and Trailing Whitespaces)
        String withSpaces = "   Hello, World!   ";
        String trimmed = withSpaces.trim();
        System.out.println("Trimmed: " + trimmed);

        // Searching for a Substring
        String text = "Java is fun";
        boolean contains = text.contains("is");
        System.out.println("Contains 'is': " + contains);

        // Replacing Characters or Substrings
        String originalReplace = "I like Java";
        String replaced = originalReplace.replace("Java", "Python");
        System.out.println("Replaced: " + replaced);

        // Splitting a String
        String sentence = "Hello, World! How are you?";
        String[] words = sentence.split(" ");
        System.out.println("Split words: " + Arrays.toString(words));

        // Comparing Strings
        String strA = "hello";
        String strB = "HELLO";
        boolean isEqual = strA.equals(strB);  // Case-sensitive
        boolean isEqualIgnoreCase = strA.equalsIgnoreCase(strB);  // Case-insensitive
        System.out.println("Equals: " + isEqual);
        System.out.println("Equals Ignore Case: " + isEqualIgnoreCase);
    }
}
