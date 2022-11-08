package Frota_estudo_caso_aula2;

public class Carro {
    private boolean documentacaoOK;
    private int AnoModelo, anoFabricacao;
    private int numeroFrota = Integer.MAX_VALUE;
    private int quilometragemPercorrida = 0;

    public boolean isDocumentacaoOK() {    // É IS pq só quer saber se a documentacao esta ok.
        return documentacaoOK;
    }

    public void setDocumentacaoOK(boolean documentacaoOK) {
        this.documentacaoOK = documentacaoOK;
    }

    public int getAnoModelo() {
        return AnoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        AnoModelo = anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getNumeroFrota() {
        return numeroFrota;
    }

    public void setNumeroFrota(int numeroFrota) {
        this.numeroFrota = numeroFrota;
    }

    public int getQuilometragemPercorrida() {
        return quilometragemPercorrida;
    }

    public void setQuilometragemPercorrida(int quilometragemPercorrida) {
        this.quilometragemPercorrida = quilometragemPercorrida;
    }

    public void percorrer(int quilometragemPercorrida) {
        this.quilometragemPercorrida = this.quilometragemPercorrida + quilometragemPercorrida;
    }
}
