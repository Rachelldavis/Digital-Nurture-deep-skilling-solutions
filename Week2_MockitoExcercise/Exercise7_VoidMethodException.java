
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExceptionLogger {
    public void error(String message) {
        throw new RuntimeException("Error logging: " + message);
    }
}

public class ExceptionLoggerTest {
    @Test
    public void testVoidMethodException() {
        ExceptionLogger mockLogger = mock(ExceptionLogger.class);
        doThrow(new RuntimeException("Mock Exception")).when(mockLogger).error("Fail");

        Exception exception = assertThrows(RuntimeException.class, () -> {
            mockLogger.error("Fail");
        });

        assertEquals("Mock Exception", exception.getMessage());
        verify(mockLogger).error("Fail");
    }
}
