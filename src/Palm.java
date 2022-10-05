public class Palm extends Växt{
    public Palm(String namn, double höjd) {
        super(namn, höjd);
    }
    @Override
    public double MängdVattenSomBehövsILiter() {
        double mängdVattenSomBehövs =  this.höjd * 0.5;
        return mängdVattenSomBehövs;
    }
    public String TypAvVattenSomBehövs(){
        return TypAvVatten.KRANVATTEN.vatten;
    }
}
