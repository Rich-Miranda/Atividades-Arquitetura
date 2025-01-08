package Tes2;

public class Bolo implements ObserverPadaria{
//    @Override
//    public void Tipo(String alimento) {
//        System.out.println("Bolo");
//
//    }
//
//    @Override
//    public Double Valor(Double valorEstimado) {
//        return 100.0;
//    }

    @Override
    public void notificacao(String notificar) {
        System.out.println("Bolo disponível");
    }
}
