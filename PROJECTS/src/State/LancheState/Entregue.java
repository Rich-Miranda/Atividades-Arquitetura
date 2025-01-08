package State.LancheState;
import State.LancheState.getMensagem;

public class Entregue implements getMensagem{
    @Override
    public void mensagem(String msg) {
        System.out.println("Entregando o pedido");
    }
}
