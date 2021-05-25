import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        int ready = 0;
        int fix = 0;
        int rejects = 0;
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int part = scanner.nextInt();
            if (part == 0) {
                ready++;
            } else if (part == 1) {
                fix++;
            } else if (part == -1) {
                rejects++;
            }
        }
        System.out.printf("%d %d %d", ready, fix, rejects);
    }
}