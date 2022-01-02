import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int one = 1;
        final int three = 3;
        while (n != one) {
            System.out.print(n + " ");
            n = n % 2 == 0 ? n / 2 : n * three + one;
        }
        System.out.print(n);
    }
}