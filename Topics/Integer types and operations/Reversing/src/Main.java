import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int ten = 10;
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * ten + n % ten;
            n /= ten;
        }
        System.out.println(reverse);
    }
}
