import java.util.*;

public class Main {
    public static void main(String[] args) {
        String matricula = "202356080091";
        int soma = 0;
        for (int i = 0; i < matricula.length(); i++) {
            soma += Character.getNumericValue(matricula.charAt(i));
        }
        int criterio = soma % 3;
        
        System.out.println("Cálculo da estrutura:");
        System.out.println("Soma dos dígitos: " + soma);
        System.out.println("Resultado % 3: " + criterio);
        System.out.println("Estrutura escolhida: " + 
            (criterio == 0 ? "List" : criterio == 1 ? "Set" : "Map"));

        Collection<Pessoa> colecao = null;
        Map<String, Pessoa> mapa = null;
        
        if (criterio == 0) {
            colecao = new ArrayList<>();
        } else if (criterio == 1) {
            colecao = new HashSet<>();
        } else {
            mapa = new HashMap<>();
        }

        Aluno aluno = new Aluno("Mariana Albuquerque", 22, "894.127.584-02", 
                              matricula, "Sistemas de Informação");
        
        Professor professor = new Professor("Ivanildo Santos", 45, "239.114.786-89", 
                                         "218674", "Programação Orientada a Objetos");
        
        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("Carlos Eduardo", 38, "125.567.454-71", 
                                "136874", "Secretaria Acadêmica", "Assistente Administrativo");

        if (criterio == 2) {
            mapa.put(aluno.getCpf(), aluno);
            mapa.put(professor.getCpf(), professor);
            mapa.put(tecnico.getCpf(), tecnico);
        } else {
            colecao.add(aluno);
            colecao.add(professor);
            colecao.add(tecnico);
        }

        System.out.println("\nDados dos membros:");
        if (criterio == 2) {
            for (Pessoa p : mapa.values()) {
                p.exibirDados();
                System.out.println("toString: " + p.toString());
                System.out.println("hashCode: " + p.hashCode() + "\n");
            }
        } else {
            for (Pessoa p : colecao) {
                p.exibirDados();
                System.out.println("toString: " + p.toString());
                System.out.println("hashCode: " + p.hashCode() + "\n");
            }
        }

        tecnico.realizarAtendimento();
    }
}