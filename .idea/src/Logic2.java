public class Logic2 {
    public static void main(String[] args) {
//        noTeenSum(1, 2, 3) → 6
//        noTeenSum(2, 13, 1) → 3
//        noTeenSum(2, 1, 14) → 3
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if (13 <= n && n <= 19 && n != 15 && n != 16)
            return 0;

        return n;
    }
}
