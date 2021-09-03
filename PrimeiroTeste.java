public class PrimeiroTeste {

	public static void main (String[] args){
		System.out.println("Wello, Word");

		if(args.length == 6){
		String nome = args[0];
		String sobrenome = args[1];
		int idade = Integer.valueOf(args[2]);
		float salario = Float.valueOf(args[3]);
		boolean java = Boolean.valueOf(args[4]);
		int qtdeMes = Integer.valueOf(args[5]);


		int anoNascimento = 2021 - idade; 
		float salarioTotal = salario * qtdeMes;


		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("Idade: " + idade);
		System.out.println("Ano de Nascimento: " + anoNascimento);
		System.out.println("Salario Mensal: " + salario);
		System.out.println("Recebimentos: " + salarioTotal);
		System.out.println("Devjava: " + java);
		} else {
		System.out.println("Deu Ruim");
		}
	}
		
}