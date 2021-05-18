import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		Scanner leitor = new Scanner(System.in);
		int idade, totalAlunos, contador=0;
		double media=0;
		
		System.out.println("Quantos alunos tem na turma?");
		totalAlunos = leitor.nextInt();
		
		while(contador<totalAlunos) {
			System.out.println("Digite a idade do " + (contador + 1) + "� aluno");
			idade = leitor.nextInt();
			media = media + idade;
			contador = contador + 1;
		}
		
		media = media / totalAlunos;
		System.out.println("A m�dia de idades � " + media);
		leitor.close();
		
	}

}
