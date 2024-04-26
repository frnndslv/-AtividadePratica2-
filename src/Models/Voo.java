package Models;

import java.util.ArrayList;

public class Voo {

    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private String textoResposta;

    public Voo() {
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
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
