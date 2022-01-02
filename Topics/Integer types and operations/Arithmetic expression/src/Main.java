import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int n = scanner.nextInt();
        final int math = ((n + 1) * n + 2) * n + 3;
        System.out.print(math);
    }
}
