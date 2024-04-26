package Models;

public class Aviao {
    
    private int IdAviaoAviao;
    private String modeloAviao;
    private float tamanhoAviao;

    public Aviao() {

    }

    public Aviao(int IdAviaoAviao, String modeloAviao, float tamanhoAviao) {
        this.IdAviaoAviao = IdAviaoAviao;
        this.modeloAviao = modeloAviao;
        this.tamanhoAviao = tamanhoAviao;
    }

    public int getIdAviao() {
        return IdAviao;
    }

    public void setIdAviao(int IdAviao) {
        this.IdAviao = IdAviao;
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
