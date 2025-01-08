package Tes1;

public class Assinante implements Observer{
    private String nome;

    public Assinante(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificar(String noticia) {
        System.out.println(nome + " recebeu a noticia " + noticia);
    }
}
