import javax.swing.*;
import java.util.ArrayList;


class Meddelande {
    public Växt FrågaAnvändare(ArrayList<Växt> växterIHotelletAsArrayList){
        Växt svar =  (Växt)JOptionPane.showInputDialog(null, "Vilken växt ska få mat?",
                "Greenest", JOptionPane.QUESTION_MESSAGE, null, växterIHotelletAsArrayList.toArray(),
                växterIHotelletAsArrayList.toString());
        return svar;
    }
    public void SvaraAnvändare(Växt växtenSomSkaMatas){
        JOptionPane.showMessageDialog(null, "Växten som ska matas är "
                + växtenSomSkaMatas.namn +", " +växtenSomSkaMatas.namn +  " behöver " +
                växtenSomSkaMatas.MängdVattenSomBehövsILiter() + " liter " + växtenSomSkaMatas.TypAvVattenSomBehövs()
                + " om dagen.");
    }
}
