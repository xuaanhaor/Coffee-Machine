import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        double end = scanner.nextInt();
        double i = 0;
        double sum = 0;
        final int three = 3;
        for (int start = s; start <= end; start++) {
            if (start % three == 0) {
                i++;
                sum += start;
            }
        }
        System.out.print(sum / i);
    }
}
