import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {
    Palm testPalm = new Palm("testPalm", 1);
    @Test
    void mängdVattenSomBehövsILiter() {
        assert (testPalm.MängdVattenSomBehövsILiter() == 0.5);
        assert (testPalm.MängdVattenSomBehövsILiter() == 100);
    }
}