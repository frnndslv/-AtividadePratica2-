package Models;

public class Passageiros extends Pessoas {
    String numeroPoltrona;
    String numeroCartaoEmbarque;

    public Passageiros() {
    }

    public Passageiros(String nome, int cpf, String telefone, String numeroPoltrona, String numeroCartaoEmbarque) {
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

}