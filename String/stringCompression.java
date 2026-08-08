package String;

public class stringCompression {

    public static String compress(String str ){
        String newStr = "";

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "aaaabbbccd";
        System.out.println(compress(str));
    }
}
/* package String;

public class stringCompression {

    public static String compress(String str) {

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Character जोड़ना
            newStr.append(str.charAt(i));

            // Count जोड़ना
            if (count > 1) {
                newStr.append(count);
            }
        }

        return newStr.toString();
    }

    public static void main(String[] args) {

        String str = "aaaabbbccd";

        System.out.println(compress(str));
    }
}

 */