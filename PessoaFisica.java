public class PessoaFisica extends Pessoa{
    private String cpf;
    private char sexo;
    private String estadoCivil;

    public PessoaFisica(String cpf, char sexo, String estadoCivil,String endereco, String nome, String telefone) {
        super(endereco,nome,telefone);
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
}
