import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Check positive, negative or zero
        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        // Check even or odd
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // Check divisibility by 5
        if (num % 5 == 0) {
            System.out.println("The number is divisible by 5");
        } else {
            System.out.println("The number is not divisible by 5");
        }

        sc.close();
    }
}
