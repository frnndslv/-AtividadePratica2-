package Models;

import java.util.ArrayList;

public class Piloto extends Pessoas {
    // brevê é o nome dado a certificaçao concedida pra pilotar tipo carteira de
    // piloto kkkk
    int idbreve;
    // piloto pode ser piloto(conduz a aeronave) ou copiloto(conduz navegaçao)
    String funcaoVoo;

    public Piloto() {
    }

    public Piloto(String nome, long cpf, String telefone, int idbreve, String funcaoVoo) {
        super(nome, cpf, telefone);
        this.idbreve = idbreve;
        this.funcaoVoo = funcaoVoo;
    }

    public int getIdbreve() {
        return idbreve;
    }

    public void setIdbreve(int idbreve) {
        this.idbreve = idbreve;
    }

    public String getFuncaoVoo() {
        return funcaoVoo;
    }

    public void setFuncaoVoo(String funcaoVoo) {
        this.funcaoVoo = funcaoVoo;
    }

    @Override
    public String toString() {
        return "Piloto [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", idbreve=" + idbreve
                + ", funcaoVoo=" + funcaoVoo + "]";
    }

}
