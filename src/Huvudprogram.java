import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Huvudprogram{



    public ArrayList<Växt> skapaVäxter() {
        Kaktus igge = new Kaktus("Igge", 0.2);
        Palm laura = new Palm("Laura", 5);
        Palm putte = new Palm("Putte", 1);
        Köttätande meatloaf = new Köttätande("Meatloaf", 0.7);
        ArrayList<Växt> växterIHotelet = new ArrayList<>();
        växterIHotelet.add(igge);
        växterIHotelet.add(laura);
        växterIHotelet.add(putte);
        växterIHotelet.add(meatloaf);
        return växterIHotelet;
    }

    public void skrivUtVäxtensBehandling() { //Nedanför förekommer inkappsling
        Meddelande frågaOchSvara = new Meddelande();
        Växt växtenSomSkaMatas = frågaOchSvara.FrågaAnvändare(skapaVäxter());
        frågaOchSvara.SvaraAnvändare(växtenSomSkaMatas);

    }

    public static void main(String[] args)
    {
      Huvudprogram GreenestPlantHotell = new Huvudprogram();
      GreenestPlantHotell.skrivUtVäxtensBehandling();
    }

}