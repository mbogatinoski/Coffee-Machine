
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];
        int max = 0;

        for(int r : numbers) {
            int v = scan.nextInt();
            v = numbers[r];
            max = numbers[r] * numbers[r + 1];
            if (numbers[r + 1] * numbers[r + 2] > max) max = numbers[r + 1] * numbers[r + 2];
        }
        System.out.println(max);
    }
}