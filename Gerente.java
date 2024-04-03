public class Gerente extends Funcionarios {

    private String departamento;

    //Construtor
    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }

    // Getters
    public String getDepartamento() {
        return departamento;
    }

    // Setters
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean info() {
        System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nSalário: " + getSalario() + "\nDepartamento: " + getDepartamento());
        return false;
    }

}
