import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int zero = 0;
        final int one = 1;
        final int two = 2;
        final int three = 3;
        int[] indexes = {zero, one, two, three};
        int input = scanner.nextInt();
        String str = String.valueOf(input);
        if (str.charAt(indexes[zero]) == str.charAt(indexes[three]) &&
            str.charAt(indexes[one]) == str.charAt(indexes[two])) {
            System.out.print("1");
        } else {
            System.out.println("37");
        }
    }
}