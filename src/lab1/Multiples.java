package lab1;

public class Multiples {
    public static void main(String[] args) {
        // We're looking for integers greater than 0 that are multiples of 3 or 5. 
        // The first four are 3, 5, 6, and 9, so there are four below 10. 
        // How many are below 1000?

        int count = multiples(16, 3, 5);
        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            boolean divByA = i % a == 0;
            boolean divByB = i % b == 0;

            if  (divByA || divByB) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int multiples() {
        // overridden method, default is 1000, 3, 5
        int cnt = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;

            if  (divBy3 || divBy5) {
                cnt++;
            }
        }
        return cnt;
    }
}
