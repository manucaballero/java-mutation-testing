package tfoc.javamutationtestingworkshop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tfoc.javamutationtestingworkshop.services.SumService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JavaMutationTestingWorkshopApplicationTests {



    @Test
    void sum() {

        SumService sumService = new SumService();
        var result = sumService.sum(1,2);

        assertEquals(3, result);
    }

    @Test
    void compareToFifty() {

        SumService sumService = new SumService();
        var result = sumService.compareToFifty(40);

        assertEquals("Smaller than or equal to 50", result);
    }

}
