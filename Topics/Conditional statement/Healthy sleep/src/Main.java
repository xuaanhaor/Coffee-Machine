import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        if (h < a) {
            System.out.print("Deficiency");
        } else if (h > b) {
            System.out.print("Excess");
        } else {
            System.out.print("Normal");
        }
        
        
    }
}
