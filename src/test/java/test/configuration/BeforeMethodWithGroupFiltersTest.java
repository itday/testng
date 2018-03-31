package test.configuration;

import org.testng.annotations.Test;
import test.InvokedMethodNameListener;
import test.SimpleBaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class BeforeMethodWithGroupFiltersTest extends SimpleBaseTest {

    @Test
    public void beforeMethodWithBeforeGroupsShouldOnlyRunBeforeGroupMethods() {
        InvokedMethodNameListener nameListener = run(new Class[] { BeforeMethodWithGroupFiltersSampleTest.class });
        assertThat(nameListener.getInvokedMethodNames())
                .isEqualTo(BeforeMethodWithGroupFiltersSampleTest.EXPECTED_INVOCATIONS);
    }

}
