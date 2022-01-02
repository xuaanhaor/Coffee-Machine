import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int sum = 0;
        final int thousand = 1000;
        while (true) {
            i = sc.nextInt();
            if (i == 0) {
                break;
            } else if (sum < thousand) {
                sum += i;
            }
        }
        if (sum >= thousand) {
            sum -= thousand;
            System.out.println(sum);
        } else {
            System.out.println(sum);
        }
    }
}
