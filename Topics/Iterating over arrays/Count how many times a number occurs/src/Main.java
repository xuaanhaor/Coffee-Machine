import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int value = sc.nextInt();
        for (int x : arr) {
            if (value == x) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}