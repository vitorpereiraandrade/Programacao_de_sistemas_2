package Aula3_18102022;

public class Principal {
    public static void main(String[] args) {

        System.out.println("CASA");
        Casa casa1 = new Casa();
        casa1.setCorDaParede("Branca");
        casa1.setNumeroDoEndereco(1600);
        casa1.abrirPortaoDaGaragem(2355);
        casa1.ligarLuzdaCozinha();


        System.out.println("\nPREDIO");
        Predio predio = new Predio();
        predio.setCorDaParede("Azul");
        predio.setNumeroDoEndereco(255);
        predio.abrirPortaoDaGaragem(2355);
        predio.interfonar(105);
        predio.abrirPortaoDosFundos(2355);

        System.out.println("\nMANSAO");
        Mansao mansaoDoProfessor = new Mansao();
        mansaoDoProfessor.setCorDaParede("Vermelho");
        mansaoDoProfessor.setNumeroDoEndereco(899);
        mansaoDoProfessor.abrirPortaoDaGaragem(2355);
        mansaoDoProfessor.ligarLuzdaCozinha();

    }
}

