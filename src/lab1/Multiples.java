package lab1;

public class Multiples {
    public static void main(String[] args) {
        int n = 1000;
        int a = 3;
        int b = 5;

        System.out.println(multiples(n, a, b));
    }

    public static int multiples(int n, int a, int b) {
        int x = 1;
        int count = 0;
        while (x < n) {
            if (x % a == 0 || x % b == 0) {
                count++;
            }
            x++;
        }
        return count;
    }
}