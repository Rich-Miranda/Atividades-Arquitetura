package Padaria;

public class Salgados implements PadariaStategy{

   PadariaStategy t;

    @Override
    public PadariaStategy custoAlimento(int quilo) {
        return t.custoAlimento(quilo);
    }
}
