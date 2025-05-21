import java.util.Objects;

public class TecnicoAdministrativo extends Pessoa {
    private String siape;
    private String setor;
    private String cargo;
    private boolean certificadoTI;

    public TecnicoAdministrativo(String nome, int idade, String cpf, String siape, 
                               String setor, String cargo) {
        super(nome, idade, cpf);
        this.siape = siape;
        this.setor = setor;
        this.cargo = cargo;
        this.certificadoTI = false;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isCertificadoTI() {
        return certificadoTI;
    }

    public void setCertificadoTI(boolean certificadoTI) {
        this.certificadoTI = certificadoTI;
    }

    public void realizarAtendimento() {
        System.out.println("\n" + getNome() + " está realizando atendimento no setor " + setor);
    }

    @Override
    public void exibirDados() {
        System.out.println("\nDados do Técnico Administrativo:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("SIAPE: " + siape);
        System.out.println("Setor: " + setor);
        System.out.println("Cargo: " + cargo);
        System.out.println("Certificado em TI: " + (certificadoTI ? "Sim" : "Não"));
    }

    @Override
    public String toString() {
        return super.toString() + "[Siape:" + siape + ", Setor:" + setor + 
               ", Cargo:" + cargo + ", Certificado TI:" + certificadoTI + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        TecnicoAdministrativo ta = (TecnicoAdministrativo) o;
        return certificadoTI == ta.certificadoTI &&
               Objects.equals(siape, ta.siape) &&
               Objects.equals(setor, ta.setor) &&
               Objects.equals(cargo, ta.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), siape, setor, cargo, certificadoTI);
    }
}