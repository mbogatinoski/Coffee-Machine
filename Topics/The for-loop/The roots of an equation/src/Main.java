import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter value a:");
        int a = scan.nextInt();
        //System.out.println("Enter value b:");
        int b = scan.nextInt();
        //System.out.println("Enter value c:");
        int c = scan.nextInt();
        //System.out.println("Enter value d:");
        int d = scan.nextInt();
        for (int i = 1; i <= 1000; i++) {
            if (a * i * i * i + b * i * i + c * i + d == 0) {
                System.out.println(i);
            }
        }
    }
}