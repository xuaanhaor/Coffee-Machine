import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in1 = scanner.nextInt();
        final int four = 4;
        int temp = 0;
        for (int i = 0; i < in1; i++) {
            int in2 = scanner.nextInt();
            if (in2 % four == 0 && in2 > temp) {
                temp = in2;
            }
        }
        System.out.print(temp);
    }
}
