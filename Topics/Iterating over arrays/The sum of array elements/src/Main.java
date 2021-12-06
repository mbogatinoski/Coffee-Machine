import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int[] elements = new int[total];
        int sum = 0;

        for (int e : elements) {
            int n = scan.nextInt();
            sum += n;
        }
        System.out.println(sum);
    }
}
