import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double p = sc.nextDouble();
        double k = sc.nextDouble();
        final double percent = 100;
        int year = 0;
        do {
            if (m == k) {
                break;
            }
            m = m + (m * p) / percent;
            ++year;
        } while (m < k);
        System.out.println(year);
    }
}
