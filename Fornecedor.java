public class Fornecedor extends PessoaJuridica {
    private String produtos;

    public Fornecedor(String cnpj, String razao, String endereco, String nome, String telefone, String produtos) {
        super(cnpj, razao, endereco, nome, telefone);
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "[ Produtos" + produtos + ", Nome do fornecedor" + getNome() + ", Endereço do fornecedor" + getEndereco()
                + ", Telefone do fornecedor" + getTelefone() + "]";
    }   
}

