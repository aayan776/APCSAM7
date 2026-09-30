import java.util.Scanner;
class KMP{
    public static void KMPSearch(String pat, String txt){
        int M = pat.length();
        int N = txt.length();

        int[] lps = new int[M];
        int j = 0;

        CompLPS(pat, M, lps);

        int i = 0;
        while(i < N){
            if (pat.charAt(j) == txt.charAt(i)){
                j++;
                i++;
            }
            if (j == M){
                System.out.println("Pattern found at index: " + (i - j));
                j = lps[j - 1];
            }else if (i < N && pat.charAt(j) != txt.charAt(i)){
                if (j != 0){
                    j = lps[j - 1];
                }else{
                    i += 1;
                }
            }
        }
    }
    public static void CompLPS(String pat, int M, int[] lps){
        int len = 0;
        int i = 1;
        lps[0] = 0;

        while (i < M){
            if (pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = lps[len - 1];
                }else{
                    lps[i] = len;
                    i++;
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

        KMPSearch(pat, txt);
    }
}