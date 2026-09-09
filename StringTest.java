import java.util.Scanner;
class StringTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String og = sc.next();

        System.out.println("Original String: " + og);

        String upper = og.toUpperCase();
        System.out.println("Uppercase String: " + upper);

        int vowels = 0;
        for (int i = 0; i < og.length(); i++){
            char ch = Character.toLowerCase(og.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
        }
        System.out.println("Number of vowels: " + vowels);

        String reverse = new StringBuilder(og).reverse().toString();
        System.out.println("Reverse String: " + reverse);

        if (og.equalsIgnoreCase(reverse)){
            System.out.println(og + " is a palindrome");
        }else{
            System.out.println(og + " is not a palindrome");
        }
    }
}