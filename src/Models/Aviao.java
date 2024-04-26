package Models;

public class Aviao {
    private int idAviaoAviao;
    private String modeloAviao;
    private float tamanhoAviao;

    public Aviao() {

    }

    public Aviao(int idAviaoAviao, String modeloAviao, float tamanhoAviao) {
        this.idAviaoAviao = idAviaoAviao;
        this.modeloAviao = modeloAviao;
        this.tamanhoAviao = tamanhoAviao;
    }

    public int getIdAviaoAviao() {
        return idAviaoAviao;
    }

    public void setIdAviaoAviao(int idAviaoAviao) {
        this.idAviaoAviao = idAviaoAviao;
    }

    public String getModeloAviao() {
        return modeloAviao;
    }

    public void setModeloAviao(String modeloAviao) {
        this.modeloAviao = modeloAviao;
    }

    public float getTamanhoAviao() {
        return tamanhoAviao;
    }

    public void setTamanhoAviao(float tamanhoAviao) {
        this.tamanhoAviao = tamanhoAviao;
    }

    @Override
    public String toString() {
        return "Aviao [idAviaoAviao=" + idAviaoAviao + ", modeloAviao=" + modeloAviao + ", tamanhoAviao=" + tamanhoAviao
                + "]";
    }

}