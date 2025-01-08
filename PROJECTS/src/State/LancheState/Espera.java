package State.LancheState;

public class Espera implements getMensagem {
    @Override
    public void mensagem(String msg) {
        System.out.println("Pedido em espera");
    }
}
