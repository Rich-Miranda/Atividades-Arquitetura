package State.LancheState;

public class Pronto implements getMensagem{
    @Override
    public void mensagem(String msg) {
        System.out.println("Pedido Pronto");
    }
}
