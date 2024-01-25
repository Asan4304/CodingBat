package Logic2;

public class makeBricks {
    public static void main(String[] args) {
        /*
        We want to make a row of bricks that is goal inches long.
        We have a number of small bricks (1 inch each) and big bricks (5 inches each).
        Return true if it is possible to make the goal by choosing from the given bricks.
        This is a little harder than it looks and can be done without any loops.

makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
         */
        makeBricks makeBricks = new makeBricks();
        System.out.println(makeBricks.makeBricks(3, 1, 8));
        System.out.println(makeBricks.makeBricks(3, 1, 9));
        System.out.println(makeBricks.makeBricks(3, 2, 10));
    }

    public boolean makeBricks(int small, int big, int goal) {
//        //   8  / 5 >=  1
//        if (goal / 5 >= big){
//            if (goal <= small + big*5){
//                return true;
//            }
//            if (goal / 5 < big){
//                if (goal % 5 <= small){
//                    return true;
//                }
//            }
//        }
//        return false;

        if (goal > small + big * 5) {
            return false;
        }
        int smallBricks = goal % 5;
        return smallBricks <= small;
    }
}



