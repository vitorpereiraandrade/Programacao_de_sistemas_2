package teste;

public class Principal {
    public static void main(String[] args) {
        Carro gol = new Carro();
        if(gol.documentacaoOK){
            System.out.println("OK");
        }else{
            System.out.println("Apreendido");
        }
    }
}
