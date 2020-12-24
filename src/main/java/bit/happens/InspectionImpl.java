package bit.happens;

public class InspectionImpl implements Inspection {

    @Override
    public void printArray(int[] a) {
        for (int number : a) {
            System.out.println(number);
        }
    }

    @Override
    public void minNumber(int[] a) {
        int result = a[0];
        for (int number : a) {
            if (a[number] < result) {
                result = a[number];
            }
        }
        System.out.println(result);
    }

    @Override
    public void maxNumber(int[] a) {
        int result = a[0];
        for (int number : a) {
            if (a[number] > result) {
                result = a[number];
            }
        }
        System.out.println(result);
    }

    @Override
    public void agvNumber(int[] a) {
        int sum = 0;
        int avg;
        for (int number : a) {
            sum = sum + a[number];
        }
        avg = sum / (a.length);
        System.out.println(avg);
    }
}
