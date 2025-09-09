package lab1;

public class Reduce {
    public static void main(String[] args) {
        int n = reduce(100);
        System.out.println(n);
    }

    public static int reduce(int n) {
        int steps = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
            }
            steps++;
        }
        return steps;
    }
}
