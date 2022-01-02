import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int element = sc.nextInt();
        int[] arr = new int[element];
        for (int i = 0; i < element; i++) {
            arr[i] = sc.nextInt();
        }
        int value = sc.nextInt();
        for (int x : arr) {
            if (x > value) {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
