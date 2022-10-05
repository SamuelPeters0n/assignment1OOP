public class Köttätande extends Växt{
    public Köttätande(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public double MängdVattenSomBehövsILiter() {
       double vatten =  (höjd * 0.2) + (0.1);
        return vatten;

    }
    public String TypAvVattenSomBehövs(){
        return TypAvVatten.PROTEINVATTEN.vatten;
    }

}
