import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();
        System.out.print(k % n);
    }
}
