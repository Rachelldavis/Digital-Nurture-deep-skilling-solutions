
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;
import org.junit.jupiter.api.Test;

class ArgumentApi {
    public String process(String input) {
        return "Processed " + input;
    }
}

class ArgumentService {
    private final ArgumentApi api;

    public ArgumentService(ArgumentApi api) {
        this.api = api;
    }

    public void processInput(String input) {
        api.process(input);
    }
}

public class ArgumentServiceTest {
    @Test
    public void testArgumentMatching() {
        ArgumentApi mockApi = mock(ArgumentApi.class);
        ArgumentService service = new ArgumentService(mockApi);
        service.processInput("Test");
        verify(mockApi).process(eq("Test"));
    }
}
