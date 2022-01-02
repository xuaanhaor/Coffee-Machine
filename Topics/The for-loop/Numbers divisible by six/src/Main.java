import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        final int six = 6;
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            int input2 = scanner.nextInt();
            if (input2 % six == 0) {
                sum += input2;
            }
        }
        System.out.print(sum);
    }
}
