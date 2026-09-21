import java.util.Scanner;
class Frequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        int[] freq = new int[str.length()];

        char[] str1 = str.toCharArray();

        for (int i = 0; i < str.length(); i++){
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++){
                if (str1[i] == str1[j]){
                    freq[i]++;
                    str1[j] = '\0';
                }
            }
        }
        System.out.println("Character frequency:");
        for (int i = 0; i < freq.length; i++){
            if (str1[i] != ' ' && str1[i] != '\0'){
                System.out.println(str1[i] + " : " + freq[i]);
            }
        }
    }
}