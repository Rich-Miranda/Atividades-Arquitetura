package Padaria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Padoca {
    List<PadariaStategy> t = new ArrayList<>();

    public void setTipoSalado(PadariaStategy t) {
        t = t;
    }

    public void Adicionar(PadariaStategy a){
        t.add(a);
//        Mostra();
    }

    public void Mostra(){
        System.out.println("Itens adicionado : ");
        for (PadariaStategy ta : t){
            System.out.println(t.getClass().getName());
        }
    }

}
