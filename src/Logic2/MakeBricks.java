package Logic2;

public class MakeBricks {
    public static void main(String[] args) {
                //1+1+1+5=8
                // makeBricks(3, 1, 8) → true
                // makeBricks(3, 1, 9) → false
                // makeBricks(3, 2, 10) → true
                MakeBricks  make = new MakeBricks();
                System.out.println(make.makeBricks(3, 1, 8));
                System.out.println(make.makeBricks(3, 1, 9));
                System.out.println(make.makeBricks(3, 2, 10));
            }
            public boolean makeBricks(int small, int big, int goal) {
                //8   :5>= 1
                if (goal > small + big * 5) {
                    return false;
                }
                int smallBricks = goal % 5;

                return smallBricks <= small;
            }


        }


