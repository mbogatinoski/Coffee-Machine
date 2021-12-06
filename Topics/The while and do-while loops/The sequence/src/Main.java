import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int count = 0;
        int max = 0;
        while (count < total) {
            int num = scan.nextInt();
            if (num % 4 == 0 && num > max) {
                max = num;
            }
            count++;
        }
        System.out.println(max);
    }
}