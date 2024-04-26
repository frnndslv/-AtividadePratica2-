package Models;

public class ComissarioBordo extends Pessoa {

    int IdComissario;
    String funcaoVoo;

    public ComissarioBordo() {

    }

    public ComissarioBordo(String nome, int cpf, String telefone, int IdComissario, String funcaoVoo) {
        super(nome, cpf, telefone);
        this.IdComissario = IdComissario;
        this.funcaoVoo = funcaoVoo;

    }

    public int getIdComissario() {
        return IdComissario;
    }

    public void setIdComissario(int idComissario) {
        this.IdComissario = IdComissario;
    }

    public String getFuncaoVoo() {
        return funcaoVoo;
    }

    public void setFuncaoVoo(String funcaoVoo) {
        this.funcaoVoo = funcaoVoo;
    }

}
