package Models;

import java.util.ArrayList;

public class Voo {
    private Aviao aviao;
    private ArrayList<Pessoas> pessoas = new ArrayList<Pessoas>();
    private String textoResposta;

    public Voo() {
    }

    public Voo(Aviao aviao, ArrayList<Pessoas> pessoas) {
        this.aviao = aviao;
        this.pessoas = pessoas;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public ArrayList<Pessoas> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoas> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public String toString() {
        this.textoResposta = "Voo - Aviao = " + aviao.toString();
        if (pessoas.size() != 0) {
            pessoas.forEach(p -> {
                this.textoResposta = textoResposta + "\n" + p.toString();
            });
        }
        return this.textoResposta;
    }

}
