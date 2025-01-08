package Equipamentos.Hardware;

import Equipamentos.Copiadora.Copiadora;
import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Impressora.Impressora;

public class Impressoras implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiadndo() {
        System.out.println("Equipamento copiado nacional");
    }

    @Override
    public void digitalizadora() {
        System.out.println("Equipamento digitalizado nacional");
    }

    @Override
    public void copia() {
        System.out.println("Equipamento fazendo xerox nacional");
    }
}
