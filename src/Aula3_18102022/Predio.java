package Aula3_18102022;

public class Predio extends Moradia {
    private int numeroDeApartamentos;

    public void interfonar(int numeroDeApartamentos){
        System.out.println("Voce interfonou para o ap: "+numeroDeApartamentos);
    }

    public void abrirPortaoDosFundos(int codigoControle){
        if (this.verificaCodigo(codigoControle)){
            System.out.println("Portao dos fundos foi aberto com sucesso");
        }else{
            System.out.println("Portao dos fundos não abriu");
        }
    }

    public int getNumeroDeApartamentos() {
        return numeroDeApartamentos;
    }

    public void setNumeroDeApartamentos(int numeroDeApartamentos) {
        this.numeroDeApartamentos = numeroDeApartamentos;
    }
}
