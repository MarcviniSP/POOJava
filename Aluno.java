public class Aluno {

 String nome;
 int idade;
 boolean ativo;
 double[] notas;
 
 public Aluno(String nome) {
     this.nome = nome;
     ativo = true;
     notas = new double[3];
 }
 
 private void setNota(double nota, int index) {
   if (n1 >= 0 && n1 <= 10) {
     this.notas[index] = nota;
   } else {
     this.notas[index] = 0;
   }
}
 
 public void setNotas(double n1, double n2, double n3) {
   setNota(n1, 0);
   setNota(n2, 1);
   setNota(n3, 2);
 }
 
 public void setIdade(int idade) {
     if (idade >= 17) {
         this.idade = idade;
         
     } else {
         this.idade = 17;
         System.out.println("Idade incorreta!");
     }
 }

 public double calculaMedia() {
  double n1 = notas[0];
  double n2 = notas[1];
  double n3 = notas[2];

  double nota1 = n1;
  double nota2 = n2;

  if (n1 > n2) {
   if (n3 > n2) {
    nota2 = n3;
   }
  } else {
   if (n3 > n1) {
    nota1 = n3;
   }
  }
  return (nota1 + nota2)/2;
 }

 public void imprimirFicha() {
        System.out.printf(" %-10s %-5d %-5.1f %-5.1f %-5.1f %-6.1f", 
            nome, idade, notas[0], notas[1], notas[2], calculaMedia());
  imprimirSituacao();
 }

 public void imprimirSituacao() {
  double media = calculaMedia();
  if (media >= 9) {
   System.out.println("Aprovado com excelencia!");
  } else if(media >= 6) {
   System.out.println("Aprovado!");
  } else {
   System.out.println("Reprovado :(");
  }
 }
}
