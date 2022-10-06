public class Köttätande extends Växt{//I denna klass förekommer arv och polymorfism
    public Köttätande(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public double MängdVattenSomBehövsILiter() {
       double vatten =  (höjd * 0.2) + (0.1);
        return vatten;

    }
    @Override
    public String TypAvVattenSomBehövs(){
        return TypAvVatten.PROTEINVATTEN.vatten;
    }

}
