package Tes2;

import java.io.Console;

public class Teste {
    public static void main(String[] args) {
        Padaria obersvador = new Padaria() ;
        Produtos p1 = new Produtos("Pão de queijq");
        Produtos p2 = new Produtos("Pão de Bolo");
       obersvador.adicionar((ObserverPadaria) p1);
        obersvador.notificarUsser("Produtos disponivesi");
        obersvador.notificacaoAlimento();


        Console.WriteLine();
    }
}
