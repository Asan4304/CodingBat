package Logic2;

public class loneSum {
    public static void main(String[] args) {
//        loneSum(1, 2, 3) → 6
//        loneSum(3, 2, 3) → 2
//        loneSum(3, 3, 3) → 0
        loneSum sum=new loneSum();
        System.out.println(sum.loneSum(1, 2, 3));
        System.out.println(sum.loneSum(3, 2, 3));
        System.out.println(sum.loneSum(3, 3, 3));
    }
    public int loneSum(int a, int b, int c) {
        if (a == b && b == c)
            return 0;
        if (a == b)
            return c;
        if (b == c)
            return a;
        if (c == a)
            return b;
        else
        return a+b+c;
    }
}
