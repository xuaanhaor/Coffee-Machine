import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        final int mn1 = -15;
        final int mx1 = 12;
        final int mn2 = 14;
        final int mx2 = 17;
        final int mn3 = 19; 
        boolean result1 = a > mn1 && a <= mx1;
        boolean result2 = a > mn2 && a < mx2;
        boolean result3 = a >= mn3;
        if (result1 || result2 || result3) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
