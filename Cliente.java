public class Cliente extends PessoaFisica{
    private double renda;
    private String interesses;
    private String profissao;

    public Cliente(String interesses, String profissao, double renda, String cpf, char sexo, String estadoCivil, String endereco, String nome, String telefone) {
        super(cpf, sexo, estadoCivil, endereco, nome, telefone);
        this.interesses = interesses;
        this.profissao = profissao;
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + getNome() + ", interesses=" + interesses + ", profissao=" + profissao + ", renda="
                + getNome() + ", getCpf()=" + getCpf() + ", getEndereco()=" + getEndereco() + ", getSexo()=" + getSexo()
                + ", getTelefone()=" + getTelefone() + ", getEstadoCivil()=" + getEstadoCivil() + "]";
    }

    
    
}
