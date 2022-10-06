public interface KalkyleraVatten { //Här förekommer interface
    default double MängdVattenSomBehövsILiter() {
        return 0;
    }
    default String TypAvVattenSomBehövs(){
        return null;
    }
}
