
import static org.mockito.Mockito.*;
import org.mockito.InOrder;
import org.junit.jupiter.api.Test;

class OrderApi {
    public void step1() {}
    public void step2() {}
}

public class OrderTest {
    @Test
    public void testInteractionOrder() {
        OrderApi mockApi = mock(OrderApi.class);
        mockApi.step1();
        mockApi.step2();

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).step1();
        inOrder.verify(mockApi).step2();
    }
}
