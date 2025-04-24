public class Funcionario extends PessoaFisica{
    int matricula;
    double salario;
    String cargo;

    public Funcionario(String cargo, int matricula, double salario,String cpf,char sexo,String estadoCivil,String endereco, String nome,String telefone) {
        super(cpf,sexo,estadoCivil,endereco,nome,telefone);
        this.cargo = cargo;
        this.matricula = matricula;
        this.salario = salario;
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcionario{");
        sb.append("matricula=").append(matricula);
        sb.append(", salario=").append(salario);
        sb.append(", cargo=").append(cargo);
        sb.append('}');
        return sb.toString();
    }

    
    

}
