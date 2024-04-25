package Models;

public class Piloto extends Pessoas {
    // brevê é o nome dado a certificaçao concedida pra pilotar tipo carteira de
    // piloto kkkk
    int idbrevê;
    // piloto pode ser piloto(conduz a aeronave) ou copiloto(conduz navegaçao)
    String funcaoVoo;

    public Piloto() {
    }

    public Piloto(String nome, int cpf, String telefone, int idbrevê, String funcaoVoo) {
        super(nome, cpf, telefone);
        this.idbrevê = idbrevê;
        this.funcaoVoo = funcaoVoo;
    }

    public int getIdbrevê() {
        return idbrevê;
    }

    public void setIdbrevê(int idbrevê) {
        this.idbrevê = idbrevê;
    }

    public String getFuncaoVoo() {
        return funcaoVoo;
    }

    public void setFuncaoVoo(String funcaoVoo) {
        this.funcaoVoo = funcaoVoo;
    }

}
