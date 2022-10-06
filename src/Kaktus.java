public class Kaktus extends Växt { //I denna klass förekommer arv och polymorfism
    public Kaktus(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public double MängdVattenSomBehövsILiter() {
    return 0.2;
    }
    public String TypAvVattenSomBehövs(){
        return TypAvVatten.MINERALVATTEN.vatten;
    }
}
