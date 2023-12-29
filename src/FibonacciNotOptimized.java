import java.util.Scanner;

public class FibonacciNotOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
