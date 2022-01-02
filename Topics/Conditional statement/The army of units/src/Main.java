import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        final int s1 = 0;
        final int s2 = 20;
        final int s3 = 250;
        final int s4 = 1000;
        if (input <= s1) {
            System.out.print("no army");
        } else if (input > s1 && input < s2) {
            System.out.print("pack");
        } else if (input >= s2 && input < s3) {
            System.out.print("throng");
        } else if (input >= s3 && input < s4) {
            System.out.print("zounds");
        } else {
            System.out.print("legion");
        }
    }
}
