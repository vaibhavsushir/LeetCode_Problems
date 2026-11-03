import java.util.Scanner;
class Recursion_Basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        fib(num);
    }
}
