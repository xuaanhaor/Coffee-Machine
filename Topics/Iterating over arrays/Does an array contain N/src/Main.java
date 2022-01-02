import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean isEqual = false;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int value = sc.nextInt();
        if (value < arr[0] || value > arr[size - 1]) {
            System.out.println(isEqual);
        } else {
            for (int x : arr) {
                if (x == value) {
                    isEqual = true;
                    break;
                }
            }
            System.out.println(isEqual);
        }
    }
}