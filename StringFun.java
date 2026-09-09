import java.util.Scanner;
class StringFun{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Enter word:");
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println("Number inputted: " + n);
        System.out.println("String inputted: " + str);

        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println("Reverse string: " + reverse);

        System.out.println("Concatenated String: " + str + reverse);
    }
}