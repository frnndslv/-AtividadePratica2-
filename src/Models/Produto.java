package Models;

public class Produto {
    protected int idProduto;
    protected String nomeProduto;
    protected float valorProduto;
    protected Categoria categoriaProduto;
    protected Fornecedor fornecedorProduto;

    public Produto() {

    }

    public Produto(int idProduto, String nomeProduto, float valorProduto, int quantidadeProduto,
            Categoria categoriaProduto, Fornecedor fornecedorProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.categoriaProduto = categoriaProduto;
        this.fornecedorProduto = fornecedorProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Categoria getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(Categoria categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public Fornecedor getFornecedorProduto() {
        return fornecedorProduto;
    }

    public void setFornecedorProduto(Fornecedor fornecedorProduto) {
        this.fornecedorProduto = fornecedorProduto;
    }

    // methodo cadastrar produto

    // mostrar todos os produtos

    // metodo excluir produto

    // alterar preço do produto

    // alterar quantidade do produto

}