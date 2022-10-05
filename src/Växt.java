public class Växt implements KalkyleraVatten {
    double höjd;
    String namn;
    public Växt(String namn, double höjd) {
        this.höjd = höjd;
        this.namn = namn;
    }

    @Override
    public String toString() {
        return namn;
    }
}
