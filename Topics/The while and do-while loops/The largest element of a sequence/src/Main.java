import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int largest = 0;
        int n;
        do {
            n = scan.nextInt();
            if (largest < n) {
                largest = n;
            }
        } while (n != 0);
        System.out.println(largest);
    }
}
