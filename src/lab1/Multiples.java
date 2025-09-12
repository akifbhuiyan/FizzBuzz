package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
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

    public static int multiples() {
        int x = 1;
        int count = 0;
        while (x < 1000) {
            if (x % 3 == 0 || x % 5 == 0) {
                count++;
            }
            x++;
        }
        return count;
    }
}