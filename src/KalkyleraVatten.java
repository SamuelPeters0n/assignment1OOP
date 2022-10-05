public interface KalkyleraVatten {
    default double MängdVattenSomBehövsILiter() {
        return 0;
    }
    default String TypAvVattenSomBehövs(){
        return null;
    }
}
