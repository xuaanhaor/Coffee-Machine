import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        final int five = 5;
        final int four = 4;
        final int three = 3;
        for (int i = 0; i < n; i++) {
            int n2 = scanner.nextInt();
            n2 = n2 == five ? a++ : n2 == four ? b++ : n2 == three ? c++ : d++;
        }
        System.out.print(d + " " + c + " " + b + " " + a);
    }
}
