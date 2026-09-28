import java.util.Scanner;
class Sub_Freq{
    public static int countSubstring(String str, String sub){
        int index = 0;
        int count = 0;

        while (index >= 0){
            index = str.indexOf(sub, index);
            if (index >= 0){
                count++;
                index += sub.length();
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        System.out.println("Enter substring:");
        String sub = sc.nextLine();

        int result = countSubstring(str, sub);
        System.out.println("Frequency of substring = " + result);
    }
}