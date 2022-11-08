package Aula4_25_10_2022;

public class Moradia {
    protected String corDaParede, portaDaFrente;
    protected String materialDoTelhado = "cêramica";
    protected int numeroDoEndereco;
    protected int codigoControle = 2355;
    protected String logradouro;

    public void imprimirEnderecoCompleto(){
        System.out.println(getEnderecoCompleto());

    }

    public void imprimirEnderecoCompleto(String prefixo){
        System.out.println(prefixo + " " + getEnderecoCompleto());
    }

    public String getEnderecoCompleto() {
        return this.getLogradouro() + "" + this.getNumeroDoEndereco() + " - Maringá / PR";
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void abrirPortaoDaGaragem(int codigoControle) {
        if (this.verificaCodigo(codigoControle)) {
            System.out.println("Portão foi aberto com sucesso");
        } else {
            System.out.println("Portão não abriu");
        }
    }

    protected boolean verificaCodigo(int codigoControle) {
        if (this.codigoControle == codigoControle) {
            return true;
        }
        return false;

    }

    public String getCorDaParede() {
        return corDaParede;
    }

    public void setCorDaParede(String corDaParede) {
        this.corDaParede = corDaParede;
    }

    public String getPortaDaFrente() {
        return portaDaFrente;
    }

    public void setPortaDaFrente(String portaDaFrente) {
        this.portaDaFrente = portaDaFrente;
    }

    public String getMaterialDoTelhado() {
        return materialDoTelhado;
    }

    public void setMaterialDoTelhado(String materialDoTelhado) {
        this.materialDoTelhado = materialDoTelhado;
    }

    public int getNumeroDoEndereco() {
        return numeroDoEndereco;
    }

    public void setNumeroDoEndereco(int numeroDoEndereco) {
        this.numeroDoEndereco = numeroDoEndereco;
    }
}
