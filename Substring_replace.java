import java.util.Scanner;
class Substring_replace{
    public static String replaceSubstring(String str, String oldSub, String newSub){
        if(str == null || oldSub == null || newSub == null || oldSub.isEmpty()){
            return str;
        }
        int startIndex = 0;
        int findIndex;

        StringBuilder replaced = new StringBuilder();

        while ((findIndex = str.indexOf(oldSub, startIndex)) != -1){
            replaced.append(str.substring(startIndex, findIndex));

            replaced.append(newSub);

            startIndex = findIndex + oldSub.length();
        }
        if (startIndex < str.length()){
            replaced.append(str.substring(startIndex));
        }
        return replaced.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        System.out.println("Enter old string:");
        String oldSub = sc.nextLine();

        System.out.println("Enter new string:");
        String newSub = sc.nextLine();

        String result = replaceSubstring(str, oldSub, newSub);
        System.out.println("Modified string: " + result);
    }
}