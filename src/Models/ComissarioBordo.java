package Models;

public class ComissarioBordo extends Pessoas {

    int idCarteiraComissario;
    String funcaoVoo;

    public ComissarioBordo() {

    }

    public ComissarioBordo(int idCarteiraComissario, String funcaoVoo) {
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

}
