public class Z {
    public static void main(String[] args) {
        int n = 6; 

        for (int i = 1; i <= 2 * n; i++) {
            if (i <= n) {
                for (int j = i; j <= n; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= 2 * (i - 1); j++) {
                    System.out.print(" ");
                }
                for (int j = i; j <= n; j++) {
                    System.out.print("*");
                }
            }
            else {
                int k = i - n;
                for (int j = 1; j <= k; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= 2 * (n - k); j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= k; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
