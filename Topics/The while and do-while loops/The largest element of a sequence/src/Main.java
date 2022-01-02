import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int temp = 0;
        do {
            n = sc.nextInt();
            if (n > temp) {
                temp = n;
            }
        } while (n != 0);
        System.out.println(temp);
    }
}