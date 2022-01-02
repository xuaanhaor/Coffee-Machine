import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();
        final int tens = 10;
        System.out.print((input / tens) % tens);
    }
}
