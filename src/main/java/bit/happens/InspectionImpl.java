package bit.happens;

public class InspectionImpl implements Inspection {


    @Override
    public int minNumber(int[] a) {
        int result = a[0];
        for (int number : a) {
            if (a[number] < result) {
                result = a[number];
            }
        }
        return result;
    }

    @Override
    public int maxNumber(int[] a) {
        int result = a[0];
        for (int number : a) {
            if (a[number] > result) {
                result = a[number];
            }
        }
        return result;
    }

    @Override
    public double agvNumber(int[] a) {
        double sum = 0;
        double avg;
        for (int number : a) {
            sum = sum + a[number];
        }
        avg = sum / (a.length);
        return avg;
    }
}
