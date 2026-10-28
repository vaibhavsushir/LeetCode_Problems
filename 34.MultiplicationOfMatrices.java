import java.util.Scanner;
 class MultiplicationOfMatrices{
        }
        System.out.println("Matrix 1 Is");
        int[][] matrix1 = arr;
        printarr(arr);
        System.out.println("Matrix 2 Is");
        int[][] matrix2 = arr2;
        printarr(arr2);
        System.out.println("Multiplication Matrix Is");
        int[][] multiply = multiply(arr, r1, c1, arr2, r2, c2);
        printarr(multiply);
    }
    static int[][] multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Wrong Input Multiplication Is Not Possible");
        }

        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return mul;
    }
            static void printarr ( int[][] array){
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }

            }
        }
