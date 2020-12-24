package bit.happens;

import org.junit.jupiter.api.Test;

public class InspectionTest {

    private final Inspection inspection = new InspectionImpl();


    @Test
    void testArray() {

        int[] numbers = new int[100];

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        inspection.minNumber(numbers);
        inspection.maxNumber(numbers);
        inspection.agvNumber(numbers);
    }
}
