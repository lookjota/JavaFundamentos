

package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Professor professor = new Professor();
    professor.setCpf("12345678");
    professor.setNome("Daniela");
    professor.setIdade(33);
    professor.setSalario(50000);

    System.out.println(professor.imprimirDadosDaPessoa());

    Aluno aluno = new Aluno();
    aluno.setCpf("1234567890");
    aluno.setIdade(19);
    aluno.setNome("Fernanda");
    aluno.setMatricula("00000");

    System.out.println(aluno.imprimirDadosDaPessoa());


  }
}
