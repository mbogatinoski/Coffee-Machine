import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] integers = new int[n];

        for(int i : integers) {
            int m = scan.nextInt();
            m = integers[i];
        }
        int count = 0;
        for (int s : integers) {
            if(integers[s + 1] == integers[s] - 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}