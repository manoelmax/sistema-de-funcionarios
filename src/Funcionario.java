public class Funcionario {

    private int id;
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(int id, String nome, int idade, double salario) {
        setId(id);
        setNome(nome);
        setIdade(idade);
        setSalario(salario);
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        if (id < 0){
            throw new IllegalArgumentException(
                    "O id não pode ser negativo."
            );
        }
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException(
                "O nome não pode ser vazio"
            );
        }
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        if (idade < 18 || idade > 70){
            throw new IllegalArgumentException(
                    "A idade deve estar entre 18 e 70"
            );
        }

        this.idade = idade;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        if (salario <= 0 || !Double.isFinite(salario)){
            throw new IllegalArgumentException(
                    "O salario deve ser maior que zero e finito!"
            );
        }
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {

        if (porcentagem <= 0 || !Double.isFinite(porcentagem)){
            throw new IllegalArgumentException(
                    "Porcentagem tem que ser maior que zero, positiva e finita!"
            );
        }

        double novoSalario = this.salario + (this.salario * (porcentagem / 100));

        if (!Double.isFinite(novoSalario)){
            throw new IllegalArgumentException(
                "O novo salario deve ser um valor finito"
            );
        }
        this.salario = novoSalario;
    }

    public String toString(){
        return "Id: " + this.id + " " + "\n" +
               "Funcionario: " + this.nome + "\n" +
               "Idade: " + this.idade + "\n" +
               "Salario: " + this.salario;
    }
}
