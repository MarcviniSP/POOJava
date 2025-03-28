import java.util.Scanner;
import java.util.Random;

public class Main {



 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  Random rand = new Random();

  System.out.print("Digite a quantidade de alunos: ");
  int quantidade = sc.nextInt();

  Aluno[] alunos = new Aluno[quantidade];

  for(int n = 0; n < quantidade; n++) {
   sc.nextLine();

   System.out.print("Nome: ");
   String nome = sc.nextLine();

   alunos[n] = new Aluno(nome);

   System.out.print("Idade: ");
   alunos[n].setIdade(sc.nextInt());

   alunos[n].ativo = true;

   double n1 = rand.nextInt(201)/10.0;
   double n2 = rand.nextInt(201)/10.0;
   double n3 = rand.nextInt(201)/10.0;
   alunos[n].setNotas(n1, n2, n3);

  }

  System.out.printf("# %-10s %-5s %-5s %-5s %-5s %-6s %-10s%n", "NOME", "IDADE", 
      "N1", "N2", "N3", "MÉDIA", "SITUAÇÃO");
  int i = 1;
  for(Aluno aluno : alunos) {
   System.out.print(i);
   aluno.imprimirFicha();
   i++;
  }
  Aluno.exibirTotalAlunos();

 }
}
 
