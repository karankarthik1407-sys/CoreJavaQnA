import java.util.Scanner;

class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Compare both strings
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
