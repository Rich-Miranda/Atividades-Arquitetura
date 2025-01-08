package State.LancheState;

public class LanchoneteState {

    public getMensagem mensagem;

    public void Preparacao(){
        mensagem = new Pronto();

    }

    public void Entregue(){
        if(mensagem.getClass().getCanonicalName().contains("Preparacao")){
            mensagem = new Entregue();
        }
    }

    public void Pronto(){
        if((mensagem == new Entregue())){
            mensagem = new Finalizando();
        }
    }

    public void Cancelar(){
        if((mensagem == new Pronto()) && (mensagem == null)){
            mensagem = new Cancelado();
        }

    }


}
