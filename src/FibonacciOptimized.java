import java.util.Scanner;

public class FibonacciOptimized {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
        long[] fibonacciNumbers = fibonacci(number);
        for (long num : fibonacciNumbers) {
            System.out.println(num);
        }
    }

    public static long[] fibonacci(int n) {
        long[] fibonacciNumbers = new long[n];
        fibonacciNumbers[0] = 0;
        if (n > 1) {
            fibonacciNumbers[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            }
        }
        return fibonacciNumbers;
    }
}
