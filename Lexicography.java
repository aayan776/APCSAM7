import java.util.Scanner;
public class Lexicography{
    public static int compareStrings(String str1, String str2){
        for(int i = 0; i < str1.length() && i < str2.length(); i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        return str1.length() - str2.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1:");
        String str1 = sc.nextLine();

        System.out.println("Enter string 2:");
        String str2 = sc.nextLine();

        int result = compareStrings(str1, str2);
        if (result == 0){
            System.out.println("Strings are equal");
        }else if (result < 0){
            System.out.println("String 1 is lexicographically smaller");
        }else{
            System.out.println("String 1 is lexicographically larger");
        }
    }
}