import empresa.*;
public class Principal {

    public static void main(String[] args) {
        Salario salario1 = new Salario(
                100,
                10.0,
                5
        );

        Salario salario2 = new Salario(
                100,
                10.0,
                5
        );
        salario2.setSalarioFixo(1000.0);

        Funcionarios funcionario1 = new Funcionarios(
                1223,
                "EVA",
                "234.567.789-62",
                "12/12/1993",
                salario1
        );

        Funcionarios funcionario2 = new Funcionarios(
                1223,
                "Rodolpho",
                "987.654.321-21",
                "01/01/1993",
                salario2
        );

        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario2.getSalario());

    }
}
