package Models;

public class Comissario extends Pessoas {

    int idCarteiraComissario;
    String funcaoVoo;

    public Comissario() {

    }

    public Comissario(String nome, long cpf, String telefone, int idCarteiraComissario, String funcaoVoo) {
        super(nome, cpf, telefone);
        this.idCarteiraComissario = idCarteiraComissario;
        this.funcaoVoo = funcaoVoo;

    }

    public int getIdCarteiraComissario() {
        return idCarteiraComissario;
    }

    public void setIdCarteiraComissario(int idCarteiraComissario) {
        this.idCarteiraComissario = idCarteiraComissario;
    }

    public String getFuncaoVoo() {
        return funcaoVoo;
    }

    public void setFuncaoVoo(String funcaoVoo) {
        this.funcaoVoo = funcaoVoo;
    }

    @Override
    public String toString() {
        return "ComissarioBordo [nome=" + nome + ", cpf=" + cpf + ", idCarteiraComissario=" + idCarteiraComissario
                + ", telefone=" + telefone + ", funcaoVoo=" + funcaoVoo + "]";
    }

}
