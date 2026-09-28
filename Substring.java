import java.util.Scanner;
public class Substring{
    public boolean isSubstring(String str1, String str2){
        int index = str1.indexOf(str2);
        return index >= 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1:");
        String str1 = sc.nextLine();

        System.out.println("Enter string 2:");
        String str2 = sc.nextLine();

        Substring obj = new Substring();

        if (obj.isSubstring(str1, str2)){
            System.out.println(str2 + " is a substring of " + str1);
        }else{
            System.out.println(str2 + " is not a substring of " + str1);
        }
    }
}