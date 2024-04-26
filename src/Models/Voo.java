package Models;

import java.util.ArrayList;

public class Voo {

    private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public Voo() {
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        Voo.pessoas = pessoas;
    }

}
