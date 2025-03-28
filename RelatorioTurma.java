public class RelatorioTurma {
  
  public static double mediaGeral(Aluno[] alunos) {
    double mediaGeral = 0;
    for(Aluno aluno : alunos){
      mediaGeral += aluno.calculaMedia();
    }
    mediaGeral /= alunos.length;
    return mediaGeral;
  }
}
