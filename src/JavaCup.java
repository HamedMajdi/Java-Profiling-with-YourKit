import java.util.ArrayList;
import java.util.Scanner;

public class JavaCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        int i = scanner.nextInt();
        System.out.println("Press number2: ");
        int j = scanner.nextInt();
        System.out.println("Press number3: ");
        int k = scanner.nextInt();
        temp();
        eval(i, j, k);
    }

    public static void eval(int i, int j, int k) {
        if (i * i + j * j == k * k || i * i == j * j + k * k || j * j == i * i + k * k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
//    public static void temp() {
//        ArrayList a = new ArrayList();
//        for (int i = 0; i < 10000; i++)
//        {
//            for (int j = 0; j < 20000; j++) {
//                a.add(i + j);
//            }
//        }
//    }


    /* METHOD 1:
    در این روش به جای استفاده از ArrayList<Integer> از یک آرایه نوع ابتدایی int استفاده میکنیم
     */
//    public static void temp() {
//        int size = 10000 * 20000;
//        int[] a = new int[size];
//        int index = 0;
//        for (int i = 0; i < 10000; i++) {
//            for (int j = 0; j < 20000; j++) {
//                a[index++] = i + j;
//            }
//        }
//    }

    /* METHOD 2:
در این نسخه از تابع temp()، مقادیر i + j  در حین تولید جمع اضافه می‌شوند .
 این باعث حذف نیاز به یک آرایه یا لیست برای ذخیره مقادیر می‌شود که به طریق قابل توجهی مصرف حافظه را کاهش می‌دهد.     */


        public static void temp() {
        long sum = 0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 20000; j++) {
                sum += i + j;
            }
        }
    }

}
