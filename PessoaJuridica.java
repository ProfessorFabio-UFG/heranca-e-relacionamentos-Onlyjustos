public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String razao;


    public PessoaJuridica(String cnpj, String razao, String endereco, String nome, String telefone) {
        super(endereco, nome, telefone);
        this.cnpj = cnpj;
        this.razao = razao;
    }
    
}
