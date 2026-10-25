import java.util.ArrayList;


public class Main {

    public static void main(String[] args){



        ArrayList<Funcionario> funcionario = new ArrayList<>();

        Funcionario f = new Funcionario(1, "Max", 35, 5000 );

        try{
            f.aumentarSalario(10);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            f.setSalario(-1000);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println(f.getSalario());
        System.out.println("Programa Finalizado!");
    }
}
