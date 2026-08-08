public class StringExample {
    public static void main(String[] args) {
        String str = "Hello, Java!";

        // Print the string
        System.out.println("String: " + str);

        // Length of the string
        System.out.println("Length: " + str.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Check if it contains a word
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // Replace text
        System.out.println("Replace: " + str.replace("Java", "World"));

        // Get a substring
        System.out.println("Substring: " + str.substring(7, 11));
    }
}