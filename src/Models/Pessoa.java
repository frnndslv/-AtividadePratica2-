package Models;

public class Pessoa {
    private int cpf;
    private String nome;
    private String telefone;

    public Pessoa() {

    }

    public Pessoa(int cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

       @Override
    public String toString() {

        return "\nCPF: " + cpf +
                "\nNome: " + nome;
    }

}

