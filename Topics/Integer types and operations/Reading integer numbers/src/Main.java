import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int begin = 0;
        final int end = 3;
        final int space = 4;
        final int[] num = new int[space];
        
        for (int i = begin; i <= end; i++) {
            num[i] = scanner.nextInt();
            System.out.println(num[i]);
        }
    }
}
