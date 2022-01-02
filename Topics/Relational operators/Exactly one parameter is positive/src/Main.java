import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextInt() > 0; // 1  1 
        boolean b = scanner.nextInt() > 0; // 0  1
        boolean c = scanner.nextInt() > 0; // -1  1
        boolean rslt = a ? !(b | c) : b ^ c;
        System.out.print(rslt);
    }
}
