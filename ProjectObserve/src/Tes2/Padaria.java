package Tes2;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.List;

public class Padaria {
    private List<ObserverPadaria> padaria = new ArrayList<>();
    private String otimasNoticias;


    public void adicionar(ObserverPadaria observe){
        padaria.add(observe);
    }

    public void removerAlimento(ObserverPadaria observe){
        padaria.add(observe);
    }

    public void notificarUsser(String notifcar){
        this.otimasNoticias = notifcar;
        notificacaoAlimento();
    }

    public void notificacaoAlimento(){
        for(ObserverPadaria padoca : padaria ){
                padoca.notificacao(otimasNoticias);
        }
    }
}
