package aulas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.sabor = "Chocolate";
        boloDeChocolate.formato = "Quadrado";
        boloDeChocolate.tamanhoEmCm = 20;

        boloDeChocolate.baterOBolo();

        Bolo boloDeMorango = new Bolo();
        boloDeMorango.sabor = "Morango";
        boloDeMorango.baterOBolo();




        System.out.println("Seu Bolo de " + boloDeChocolate.sabor);
        System.out.println(boloDeChocolate.formato);
        System.out.println(boloDeChocolate.tamanhoEmCm);

    }
}