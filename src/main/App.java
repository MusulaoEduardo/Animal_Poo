package main;

import model.ClassifAnimal;

public class App {
    public static void main(String[] args) throws Exception {

        ClassifAnimal b = new ClassifAnimal();
        b.adicinoarAnimal("dudu", "animalia", "Voador", 2);
        // System.out.println(b);
        b.adicinoarAnimal("bebe", "Animalia", "terrestre", 4);
        b.adicinoarAnimal("ped", "animalia", "voador", 2);

        // b.VerificarLista();
        // verificacao de ircremento de idAnimal
        // System.out.println(b.getListaAnimal().get(0));
        // System.out.println(b.getListaAnimal().get(1));
        b.listarAnimaisPorCategoria("voador");
        b.AnimaisNaLista();
        // b.AnimaisNaLista();
        // b.Escolha(0);
    }
}
