import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Frequency_OOP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.println("For: " + str1 + " :");
        frequency(str1);

        System.out.println("Enter String 1: ");
        String str2 = sc.nextLine();
        System.out.println("For: " + str2 + " :");
        frequency(str2);
    }
    private static void frequency(String s){
        if (s.length() == 0){
            System.out.println("Empty String");
        }

        ArrayList<CharOccur> occurences = new ArrayList<CharOccur>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int flag = 0;

            for(CharOccur o : occurences){
                if (o.character == c){
                    o.occurence += 1;
                    flag = 1;
                }
            }
            if (flag == 0){
                CharOccur grp = new CharOccur(c, 1);
                occurences.add(grp);
            }
        }
        for (CharOccur o : occurences){
            System.out.println(o.character + " : " + o.occurence);
        }
    }
}
class CharOccur{
    char character;
    int occurence = 0;

    CharOccur(char character, int occurence){
        this.character = character;
        this.occurence = occurence;
    }
}