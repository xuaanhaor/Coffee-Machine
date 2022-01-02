public class Main {

    public static void main(String[] args) {
        int counter = 0;
        for (Secret str : Secret.values()) {
            if (String.valueOf(str).startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

/* sample enum for inspiration
   enum Secret {
    STAR, CRASH, START, // ...
}
*/