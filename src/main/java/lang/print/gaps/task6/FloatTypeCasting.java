package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {

        float diff = numberToBeRounded - (int) numberToBeRounded;
        if (diff >= 0.5) {
            System.out.println((int) Math.ceil(numberToBeRounded));
        } else {
            System.out.println((int) Math.floor(numberToBeRounded));

        }
    }
}

