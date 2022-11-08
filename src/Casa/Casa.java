package Casa;

public class Casa {
    private String corDaParede, portaDaFrente;
    private String materialDoTelhado = "ceramica";
    private int numeroDoEndereco;
    private int codigoControle = 2355;  // questao de segurança (private) não consegue trocar na classe principal o código do portao

    public Casa() {

    }
    public void abrirPortaoDaGaragem(int codigoControle){
        if (this.verificaCodigo(codigoControle)){                         // this = variavel da Classe, vai usar a Classe
            System.out.println("Portão foi aberto");
        }else {
            System.out.println("Portão não abriu");
        }
    }

    public boolean verificaCodigo(int codigoControle) {
        if (this.codigoControle == codigoControle) {
            return true;
        }else{
            return false;
        }

    }

    public void setNumeroDoEndereco(int numeroDoEndereco) {   // ta criando um metodo - set = pra inserir o valor
        if(this.numeroDoEndereco == 0){
            this.numeroDoEndereco = numeroDoEndereco;          // ta criando o atributo
        }
    }
    public int getNumeroDoEndereco(){
        return this.numeroDoEndereco;            // Ta criando outro metodo - get = pra pegar o valor
    }


    public void setCorDaParede(String branca) {
    }


    public void materialDoTelhado(String ceramica) {
    }
}
