import java.util.Arrays;
import java.util.Scanner;

class Anagram{
    public static boolean isAnagram(char[] str1, char[] str2){
        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2) return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++){
            if (str1[i] != str2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word 1:");
        String inp1 = sc.nextLine();

        System.out.println("Enter word 2:");
        String inp2 = sc.nextLine();

        char[] str1 = inp1.toCharArray();
        char[] str2 = inp2.toCharArray();

        if (isAnagram(str1, str2)){
            System.out.println(inp1 + " is an angram of " + inp2);
        }else{
            System.out.println(inp1 + " is not an angram of " + inp2);
        }
    }
}