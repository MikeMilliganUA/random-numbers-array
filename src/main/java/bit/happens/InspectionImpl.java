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
    public int agvNumber(int[] a) {
        int sum = 0;
        int avg;
        for (int number : a) {
            sum = sum + a[number];
        }
        avg = sum / (a.length);
        return avg;
    }
}
