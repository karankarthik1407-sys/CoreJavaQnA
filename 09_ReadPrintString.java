import java.util.Scanner;

class ReadPrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("You entered: " + str);

        sc.close();
    }
}
