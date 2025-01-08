package Padaria;

public class Doces implements PadariaStategy{
    PadariaStategy t;

    private String nome;

    public Doces(String nome) {
        this.nome = nome;
    }

    @Override
    public PadariaStategy custoAlimento(int quilo) {
        return t.custoAlimento(quilo);
    }
}
