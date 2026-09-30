import java.util.Scanner;

class Rabin_Karp{
    public final static int d = 10;

    public static void search(String pat, String txt, int q){
        int m = pat.length();
        int n = txt.length();

        int p = 0;
        int t = 0;
        int  h = 1;

        for (int i = 0; i < m - 1; i++){
            h = (h * d) % q;
        }

        for (int i = 0; i < m; i++){
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        for (int i = 0; i <= n - m; i++){
            if (p == t){
                int j = 0;
                while (j < m && pat.charAt(j) == txt.charAt(i + j)){
                    j++;
                }
                if (j == m){
                    System.out.println("Pattern found at index: " + (i + 1));
                }
            }
            if (i < n - m){
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;

                if (t < 0){
                    t += q;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String txt = sc.nextLine();

        System.out.println("Enter pattern:");
        String pat = sc.nextLine();

        System.out.println("Enter prime number:");
        int q = sc.nextInt();

        search(pat, txt, q);
    }
}