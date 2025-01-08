package State.LancheState;


public class Cancelado implements getMensagem {
    @Override
    public void mensagem(String msg) {
        System.out.println("Pedido cancelado");
    }
}
