package Aula4_25_10_2022;

public class Principal {
    public static void main(String[] args) {

        System.out.println("CASA");
        Casa casa1 = new Casa();
        casa1.setCorDaParede("Branca");
        casa1.setNumeroDoEndereco(1600);
        casa1.abrirPortaoDaGaragem(2355);
        casa1.ligarLuzdaCozinha();
        casa1.setLogradouro("Av. Brasil ");
        // imprimeEndereco("O endereço da Casa é ", casa1);
        casa1.imprimirEnderecoCompleto("O endereço da casa é: ");



        System.out.println("\nPREDIO");
        Predio predio = new Predio();
        predio.setCorDaParede("Azul");
        predio.setNumeroDoEndereco(255);
        predio.abrirPortaoDaGaragem(2355);
        predio.interfonar(105);
        predio.abrirPortaoDosFundos(2355);
        predio.setLogradouro("Av. Paulista");
        predio.setNomeDoPredio("Edificio Unicesumar");
        // imprimeEndereco("O endereço do Prédio é: ", predio);
        predio.imprimirEnderecoCompleto("O endereço do prédio é: ");



        System.out.println("\nMANSAO");
        Mansao mansaoDoProfessor = new Mansao();
        mansaoDoProfessor.setCorDaParede("Vermelho");
        mansaoDoProfessor.setNumeroDoEndereco(899);
        mansaoDoProfessor.abrirPortaoDaGaragem(2355);
        mansaoDoProfessor.ligarLuzdaCozinha();
        mansaoDoProfessor.setLogradouro("Av. Morumbi ");
        // imprimeEndereco("O endereço da mansão é: ", mansaoDoProfessor);
        mansaoDoProfessor.imprimirEnderecoCompleto("O endereço da mansão é: ");


    }

    public static void imprimeEndereco(String prefixo, Moradia moradia) {
        System.out.println(prefixo + moradia.getEnderecoCompleto());
    }
}

