package Strategy;

import Padaria.Doces;
import Padaria.PadariaStategy;
import Padaria.Padoca;
import Padaria.Salgados;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Padoca pad1 = new Padoca();
        pad1.setTipoSalado(new Doces("Doce de leite"));
        pad1.Adicionar(new Doces("Cocada"));
        pad1.Adicionar(new Doces("Jujuba"));
        pad1.Adicionar(new Doces("pé de moleque"));
        pad1.Mostra();
    }
}