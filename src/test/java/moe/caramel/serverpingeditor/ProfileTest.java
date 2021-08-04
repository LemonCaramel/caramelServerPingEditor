package moe.caramel.serverpingeditor;

import moe.caramel.serverpingeditor.impl.CaramelProfileImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProfileTest {

    @Test
    public void profileTest() {
        CaramelProfileImpl test = new CaramelProfileImpl("TEST");
        Assertions.assertNull(test.getId());
    }
}
