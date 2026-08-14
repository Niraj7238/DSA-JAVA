package Recursion;

public class removeDuplicateFromString {

    public static void removeDuplicates(String str, int idx,
                                        StringBuilder newStr, boolean[] map) {

        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // current character
        char currChar = str.charAt(idx);

        if (map[currChar - 'a']) {
            // duplicate hai
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            // first time character mila
            map[currChar - 'a'] = true;

            removeDuplicates(str, idx + 1,
                    newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "akashkumaryadav";

        removeDuplicates(
                str,
                0,
                new StringBuilder(""),
                new boolean[26]
        );
    }
}