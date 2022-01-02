import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        String noSpaceInput1 = first.replaceAll(" ", "");
        String noSpaceInput2 = second.replaceAll(" ", "");
        System.out.println(noSpaceInput1.equals(noSpaceInput2));
    }
}
