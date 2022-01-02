import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        switch (input) {
            case "triangle" : {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double p = (a + b + c) / 2;
                double heron = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(heron);
                break;
            }
            case "rectangle" : {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println(a * b);
                break;
            }
            case "circle" : {
                final double pi = 3.14;
                double r = sc.nextDouble();
                System.out.println(r * r * pi);
                break;
            }
            default :
                System.out.println("Invalid input");
                break;
        }
    }
}
