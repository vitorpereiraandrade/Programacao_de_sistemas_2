package Aula4_Estudo_de_caso_25_10_2022;

public class Veiculos {
    private boolean documentacaoOK;
    private int AnoModelo, anoFabricacao;
    private int numeroFrota = Integer.MAX_VALUE;
    private int quilometragemPercorrida = 0;

    public boolean isDocumentacaoOK() {
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