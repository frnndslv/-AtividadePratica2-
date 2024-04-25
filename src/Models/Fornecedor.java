package Models;

public class Fornecedor {
    int idFornecedor;
    String nomeFornecedor;
    String teleforneFornecedor;
    String enderecoFornecedor;

    public Fornecedor() {
    }

    public Fornecedor(int idFornecedor, String nomeFornecedor, String telefoneFornecedor, String enderecoFornecedor) {
        this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.teleforneFornecedor = telefoneFornecedor;
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getTeleforneFornecedor() {
        return teleforneFornecedor;
    }

    public void setTeleforneFornecedor(String teleforneFornecedor) {
        this.teleforneFornecedor = teleforneFornecedor;
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    // cadastrar fornecedor

    // mostrar todos fornecedores

    // alter informaçoes de fornecedor (numero de telefone fornecedor,endereço
    // fornecedor.)
}