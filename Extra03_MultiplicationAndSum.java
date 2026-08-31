import java.util.Scanner;

class MultiplicationAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        // Print multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int result = num * i;

            System.out.println(num + " x " + i + " = " + result);

            sum = sum + result;
        }

        // Sum of all 10 results
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
