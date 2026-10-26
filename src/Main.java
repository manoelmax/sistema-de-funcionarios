import java.util.ArrayList;


public class Main {

    public static void main(String[] args){



        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Funcionario f1 = new Funcionario(1, "Max", 35, 5000 );
        funcionarios.add(f1);
        Funcionario f2 = new Funcionario(2, "Ana", 28, 4200);
        funcionarios.add(f2);



        try{
            f1.aumentarSalario(0);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            f1.setSalario(-1000);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


        System.out.println("Programa Finalizado!");

        for (Funcionario funcionario : funcionarios){
            System.out.println(funcionario);
        }

    }
}
