import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();

        int[] numbers = new int[s];
        for(int n : numbers) {
            int x = scan.nextInt();
            numbers[n] = x;
        }
        String nums = numbers.toString();
        int a = scan.nextInt();
        int b = scan.nextInt();
        String ints = Integer.toString(a) + Integer.toString(b);

        if(nums.contains(ints)) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }
}