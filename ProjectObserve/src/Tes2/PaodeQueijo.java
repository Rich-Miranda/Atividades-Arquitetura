package Tes2;

public class PaodeQueijo implements ObserverPadaria {
//    @Override
//    public void Tipo(String alimento) {
//        System.out.println("Pao de queijo");
//    }
//
//    @Override
//    public Double Valor(Double valorEstimado) {
//        return 5.00;
//    }

    @Override
    public void notificacao(String notificar) {
        System.out.println("Pao de queijo disponivel");

    }
}
