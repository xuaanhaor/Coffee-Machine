//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int start = 8;
        final int reverse = -1;
        Scanner sc = new Scanner(System.in);
        String[] text = new String[8];
        for (int i = 0; i < start; i++) {
            text[i] = sc.next();
        }
        for (int j = 7; j > reverse; j--) {
            System.out.print(text[j] + "\n");
        }
    }
}