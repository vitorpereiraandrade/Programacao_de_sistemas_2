package Aula3_Estudo_de_Caso;

public class Principal {
    public static void main(String[] args) {
        Carro gol = new Carro();
        gol.setQuantidadeDePassageiros(5);
        if(gol.isDocumentacaoOK()){
            System.out.println("OK");
        }else{
            System.out.println("Apreendido");
        }

        System.out.println("km "+ gol.getQuilometragemPercorrida());
        gol.percorrer(1000);
        System.out.println("km "+ gol.getQuilometragemPercorrida());
        gol.percorrer(500);
        System.out.println("km "+ gol.getQuilometragemPercorrida());


        System.out.println("\nCaminhao");
        Caminhao caminhao = new Caminhao();
        caminhao.setCapacidadeDeCarga(5000);
        caminhao.percorrer(400);
        System.out.println("km "+caminhao.getQuilometragemPercorrida());
    }
}

