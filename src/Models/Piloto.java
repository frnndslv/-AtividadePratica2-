package Models;

public class Piloto extends Pessoa {
    // brevê é o nome dado a certificaçao concedida pra pilotar tipo carteira de
    // piloto 
    int Idbreve;
    // piloto pode ser piloto (conduz a aeronave) ou copiloto(conduz navegaçao)
    String funcaoVoo;

    public Piloto() {
    }

    public Piloto(String nome, int cpf, String telefone, int Idbreve, String funcaoVoo) {
        super(nome, cpf, telefone);
        this.idbreve = Idbreve;
        this.funcaoVoo = funcaoVoo;
    }

    public int getIdbreve() {
        return Idbreve;
    }

    public void setIdbreve(int Idbreve) {
        this.Idbreve = Idbrevê;
    }

    public String getFuncaoVoo() {
        return funcaoVoo;
    }

    public void setFuncaoVoo(String funcaoVoo) {
        this.funcaoVoo = funcaoVoo;
    }

}
