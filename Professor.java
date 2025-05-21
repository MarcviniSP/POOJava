import java.util.Objects;

public class Professor extends Pessoa {
    private String siape;
    private String disciplina;

    public Professor(String nome, int idade, String cpf, String siape, String disciplina) {
        super(nome, idade, cpf);
        this.siape = siape;
        this.disciplina = disciplina;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nDados do Professor:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("SIAPE: " + siape);
        System.out.println("Disciplina: " + disciplina);
    }

    @Override
    public String toString() {
        return super.toString() + "[Siape:" + siape + ", Disciplina:" + disciplina + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return Objects.equals(siape, professor.siape) && 
               Objects.equals(disciplina, professor.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), siape, disciplina);
    }
}