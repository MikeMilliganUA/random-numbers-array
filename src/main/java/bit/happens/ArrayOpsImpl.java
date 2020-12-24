package bit.happens;

public class ArrayOpsImpl implements ArrayOps {


    @Override
    public int minNumber(int[] a) {
        int result = a[0];
        for (int number : a) {
            if (result > number) {
                result = number;
            }
        }
        return result;
    }

    @Override
    public int maxNumber(int[] a) {
        int result = a[0];
        for (int i=0; i < a.length; i++) {
            if (result < a[i]) {
                result = a[i];
            }
        }
        return result;
    }

    @Override
    public double avgNumber(int[] a) {
        double sum = 0;
        for (int number : a) {
            sum = sum + number;
        }
        return sum / (a.length);
    }
}
