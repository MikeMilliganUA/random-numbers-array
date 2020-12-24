package bit.happens;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayOpsTest {

    private final ArrayOps arrayOps = new ArrayOpsImpl();
    private static final int[] TEST_ARRAY = {5, 8, 2, 3, 1};

    @Test
    void getMin() {
        int result = arrayOps.minNumber(TEST_ARRAY);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void getMax() {
        int result = arrayOps.maxNumber(TEST_ARRAY);
        assertThat(result).isEqualTo(8);
    }

    @Test
    void getAvg() {
        double result = arrayOps.avgNumber(TEST_ARRAY);
        assertThat(result).isEqualTo(3.8);
    }
}
