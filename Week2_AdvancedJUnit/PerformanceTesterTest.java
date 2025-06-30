
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class PerformanceTesterTest {

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void testTaskWithinTimeout() throws InterruptedException {
        PerformanceTester tester = new PerformanceTester();
        tester.performTask(); // should complete in < 1s
    }
}
