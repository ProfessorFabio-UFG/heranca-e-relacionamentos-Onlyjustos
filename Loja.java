


public class Loja {
    public static Funcionario funcionarios[];
    public static Cliente clientes[];
    public static Fornecedor fornecedores[];
    
    public static void main(String args[]){
        funcionarios = new Funcionario[10];
        clientes = new Cliente[10];
        fornecedores = new Fornecedor[10];
        
        cadastraFuncionarios("a",1,3,"c",'f',"dsa","das","das","das");
        cadastraClientes("interesses", "profissao", 2000, "cpf", 'f', "estadoCivil", "endereco", "nome", "telefone");
        
        demiteFuncionario(0);
        lista();

    }
    public static void cadastraClientes(String interesses,String profissao,double renda,String cpf, char sexo, String estadoCivil, String endereco, String nome,String telefone){
        clientes[0] = new Cliente(interesses,profissao,renda,cpf,sexo,estadoCivil,endereco,nome,telefone);

    }
    public static void cadastraFuncionarios(String cargo, int matricula, double salario,String cpf,char sexo,String estadoCivil,String endereco, String nome,String telefone) {
        funcionarios[0] = new Funcionario(cargo,matricula, salario, cpf, sexo, estadoCivil, endereco, nome, telefone);
    }
    public static void demiteFuncionario(int indice){
        funcionarios[indice] = null;
    }
    public static void cadastraFornecedor(String cnpj, String razao, String endereco, String nome, String telefone, String produtos){

    }
    public static void lista(){
        for(int i = 0; i<10;i++){
            if(funcionarios[i]!=null){
                System.out.println(funcionarios[i]);
            }
            if(clientes[i]!=null){
                System.out.println(clientes[i]);
            }
            if(fornecedores[i]!=null){
                System.out.println(fornecedores[i]);
            }
        }
        
    }


}
