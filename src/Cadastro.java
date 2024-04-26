import java.util.ArrayList;
import java.util.List;

import Models.Pessoa;

public class Cadastro {

    private static List<Pessoa> listaPessoa = new ArrayList<>();

    public static void cadastrar(Pessoa Pessoa) {
        listaPessoa.add(Pessoa);
    }

    public static List<Pessoa> getListaPessoa() {
        return listaPessoa;
    }
}
