package Aula4_25_10_2022;

public class Predio extends Moradia {
    private int numeroDeApartamentos;
    private String nomeDoPredio;


    public String getEnderecoCompleto() {
        return super.getEnderecoCompleto() + " - " + this.getNomeDoPredio();
    }

    public String getNomeDoPredio() {
        return nomeDoPredio;
    }

    public void setNomeDoPredio(String nomeDoPredio) {
        this.nomeDoPredio = nomeDoPredio;
    }

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
