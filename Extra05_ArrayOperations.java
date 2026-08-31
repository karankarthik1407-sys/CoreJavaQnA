import java.util.Scanner;

class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        // Accept 10 integers
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];
        int sum = 0;
        int even = 0;
        int odd = 0;

        // Find required values
        for (int i = 0; i < 10; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }

            sum = sum + arr[i];

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        double average = sum / 10.0;

        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);
        System.out.println("Sum of elements = " + sum);
        System.out.println("Average of elements = " + average);
        System.out.println("Number of even elements = " + even);
        System.out.println("Number of odd elements = " + odd);

        sc.close();
    }
}
