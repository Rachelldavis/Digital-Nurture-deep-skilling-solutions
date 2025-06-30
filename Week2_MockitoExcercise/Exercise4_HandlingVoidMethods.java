
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class Logger {
    public void log(String message) {}
}

class LogService {
    private final Logger logger;

    public LogService(Logger logger) {
        this.logger = logger;
    }

    public void logSomething() {
        logger.log("Hello");
    }
}

public class LogServiceTest {
    @Test
    public void testVoidMethod() {
        Logger mockLogger = mock(Logger.class);
        doNothing().when(mockLogger).log(anyString());
        LogService service = new LogService(mockLogger);
        service.logSomething();
        verify(mockLogger).log("Hello");
    }
}
