import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int day = scanner.nextInt();
        int night = scanner.nextInt();
        int date = 0;
        while (h > 0) {
            date++;
            h = h - day;
            if (h <= 0) {
                break;
            }
            h = h + night;
        }
        System.out.println(date);
    }
}