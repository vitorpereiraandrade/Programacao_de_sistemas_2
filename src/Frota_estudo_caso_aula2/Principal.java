package Frota_estudo_caso_aula2;

public class Principal {

    public static void main(String[] args) {
        Carro gol = new Carro();
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
    }
}

