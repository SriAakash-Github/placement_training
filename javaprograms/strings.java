public class strings {
    public static void main(String[] args) {
        String str ="studytonight!";
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        int len = str.length();
        System.out.println("Length of the string is: " + len);
        System.out.println("Seperate the string into characters:");
        for(int i=0; i<len; i++) {
            System.out.println(str.charAt(i));
        }
        String str1 = str.toLowerCase();
        System.out.println("String in lowercase: " + str1);
        String str2 = str.toUpperCase();
        System.out.println("String in uppercase: " + str2);
        }
    }

