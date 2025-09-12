package lab1;

public class Multiples {
    public static void main(String[] args) {
        int x = 1;
        int count = 0;
        while (x < 1000) {
            if (x % 3 == 0 || x % 5 == 0) {
                count++;
            }
            x++;
        }
        System.out.println(count);
    }
}
