package State.LancheState;
import State.LancheState.getMensagem;
public class Finalizando implements getMensagem{
    @Override
    public void mensagem(String msg) {
        System.out.println("Pedido finalizado");
    }
}
