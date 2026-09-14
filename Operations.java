class Operations{
    public static void main(String[] args) {
        String str = "Hello, World!";

        //Removes starting and trailing whitespace
        String str1 = str.trim();

        //Retuns length
        int str2 = str.length();

        //Returns character at index
        char str3 = str.charAt(0);

        //Returns substring (starts from specified index and ends at the end of string)
        String str4 = str.substring(4);

        //Returns substring (starts from specified index and ends at specified index)
        String str5 = str.substring(4, 7);

        //Returns true if string starts with specified combination of letters
        boolean str6 = str.startsWith("Hel");

        //Returns true if string ends with specified combination of letters
        boolean str7 = str.startsWith("!");

        //Returns true if string contains specified combination of letters
        boolean str8 = str.contains("llo,");

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
    }
}