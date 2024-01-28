package Logic1;

public class specialEleven {
    public static void main(String[] args) {
//        specialEleven(22) → true
//        specialEleven(23) → true
//        specialEleven(24) → false
        System.out.println(specialEleven(22));
        System.out.println(specialEleven(23));
        System.out.println(specialEleven(24));
    }

    public static boolean specialEleven(int n) {
        if (n % 11 == 0 || n % 11 == 1)
            return true;
        else
            return false;
    }
}