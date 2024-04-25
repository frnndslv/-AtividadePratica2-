package Models;

public class Aviao {
    protected int idAviaoAviao;
    protected String modeloAviao;
    protected float tamanhoAviao;

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

}