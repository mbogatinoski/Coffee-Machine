import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        int DIVISOR = 6;
        for (int i = 0; i < num; i++) {
            int n = scan.nextInt();
            if (n % DIVISOR == 0) {
                sum+=n;
            }
        }
        System.out.println(sum);
    }
}
