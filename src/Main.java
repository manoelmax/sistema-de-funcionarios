import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){



        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Funcionario f1 = new Funcionario(1, "Max", 35, 5000 );
        funcionarios.add(f1);
        Funcionario f2 = new Funcionario(2, "Ana", 28, 4200);
        funcionarios.add(f2);

        Scanner sc = new Scanner(System.in);



            boolean salarioInvalido = false;
            while (salarioInvalido == false) {
                try {
                    System.out.println("Digite a porcentagem de aumento");
                    double porcentagem = sc.nextDouble();
                    f1.aumentarSalario(porcentagem);
                    salarioInvalido = true;
                } catch (SalarioInvalidoException e){
                    System.out.println("Erro: " + e.getMessage());
                    System.out.println("Digite novamente!");
                }
            }





    }
}
