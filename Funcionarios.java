public class Funcionarios {

    private String nome;
    private int idade;
    private double salario;

    // Construtor
    public Funcionarios(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public boolean info() {
        System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nSalário: " + getSalario());
        return false;
    }
}
