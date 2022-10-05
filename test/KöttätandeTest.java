import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeTest {

    Köttätande testKöttätande = new Köttätande("test", 10);


    @Test
    void mängdVattenSomBehövsILiter() {
        assert (testKöttätande.MängdVattenSomBehövsILiter() != 5);
        assert (testKöttätande.MängdVattenSomBehövsILiter() == 2.1);
    }

}