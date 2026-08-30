import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];

        System.out.println("Enter second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix addition
        if (r1 == r2 && c1 == c2) {
            System.out.println("Matrix Addition:");

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print((a[i][j] + b[i][j]) + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix addition is not possible");
        }

        // Matrix multiplication
        if (c1 == r2) {
            int[][] product = new int[r1][c2];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        product[i][j] =
                            product[i][j] + a[i][k] * b[k][j];
                    }
                }
            }

            System.out.println("Matrix Multiplication:");

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible");
        }

        sc.close();
    }
}
