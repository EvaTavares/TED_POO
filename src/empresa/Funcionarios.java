package empresa;

 //funcionários tem matrícula, nome, CPF e data de nascimento(atributos obrigatórios).
public class Funcionarios {
    private Integer matricula;
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private Salario salario;


    //construtor que inicializa o cadastro dos funcionários

     public Funcionarios(Integer matricula, String nome, String cpf, String dataDeNascimento,Salario salario) {
         this.matricula = matricula;
         this.nome = nome;
         this.cpf = cpf;
         this.dataDeNascimento = dataDeNascimento;
         this.salario = salario;
     }
     //método chamando outro método da classe salário
     public Double getSalario(){
        return salario.getSalarioFinal();
     }

 }
