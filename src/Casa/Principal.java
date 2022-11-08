package Casa;

public class Principal {
    public static void main(String[] args) {
        Casa casa1 = new Casa();
        Casa casa2 = new Casa();
        Casa casa3 = new Casa();

        casa1.setCorDaParede("Branca");   // pra ficar encapsulado
        casa1.materialDoTelhado("Ceramica");
        casa2.setCorDaParede("Azul");

        casa1.abrirPortaoDaGaragem(8977);  // codigo está errado pra abrir o portao
        casa1.abrirPortaoDaGaragem(2355);



        casa1.setNumeroDoEndereco(1500);
        casa1.setNumeroDoEndereco(1600);

        System.out.println("O numero do endereço é "+ casa1.getNumeroDoEndereco());
    }
}