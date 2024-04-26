package Models;

public class Passageiro extends Pessoa {
    String numeroPoltrona;
    String numeroCartaoEmbarque;

    public Passageiro() {
    }

    public Passageiro(String nome, long cpf, String telefone, String numeroPoltrona, String numeroCartaoEmbarque) {
        super(nome, cpf, telefone);
        this.numeroPoltrona = numeroPoltrona;
        this.numeroCartaoEmbarque = numeroCartaoEmbarque;
    }

    public String getNumeroPoltrona() {
        return numeroPoltrona;
    }

    public void setNumeroPoltrona(String numeroPoltrona) {
        this.numeroPoltrona = numeroPoltrona;
    }

    public String getNumeroCartaoEmbarque() {
        return numeroCartaoEmbarque;
    }

    public void setNumeroCartaoEmbarque(String numeroCartaoEmbarque) {
        this.numeroCartaoEmbarque = numeroCartaoEmbarque;
    }

    @Override
    public String toString() {
        return "Passageiro [nome=" + nome + ", cpf=" + cpf + ", numeroPoltrona=" + numeroPoltrona + ", telefone="
                + telefone + ", numeroCartaoEmbarque=" + numeroCartaoEmbarque + "]";
    }

}
