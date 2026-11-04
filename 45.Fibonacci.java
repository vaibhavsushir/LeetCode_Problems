import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        for(int i=0 ;i<=num; i++) {
            System.out.println(fib(i));
        }
        }
}
