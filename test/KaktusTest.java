import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {


    Kaktus testKaktus = new Kaktus("test", 1.5);
    @Test
    void mängdVattenSomBehövsILiter() {
        assert (testKaktus.MängdVattenSomBehövsILiter() == 0.2);
        assert (testKaktus.MängdVattenSomBehövsILiter() != 5);
    }
}