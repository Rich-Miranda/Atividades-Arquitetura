package Tes1;

import java.util.ArrayList;
import java.util.List;

public class SistemaNoticias {
    private List<Observer> observedores = new ArrayList<>();
    private String ultimaNoticias;

    public void adicionarObservedor(Observer observer){
        observedores.add(observer);
    }

    public void removerObservedor(Observer observer){
        observedores.remove(observer);
    }

    public void ultimaNoticia(String noticia){
        this.ultimaNoticias = noticia;
        notificarObservadores();
    }

    public void notificarObservadores(){
        for (Observer observer : observedores){
            observer.notificar(ultimaNoticias);
        }
    }

}
